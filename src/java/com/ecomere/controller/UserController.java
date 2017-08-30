/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecomere.controller;

import com.ecomere.dao.UserDAO;
import com.ecomere.model.User;
import com.ecomere.service.UserDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author iamsu
 */
@WebServlet(name = "UserController", urlPatterns = {"/User","/User.do"})
public class UserController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
        String reqPage=request.getHeader("referer");
        UserDAO ud=new UserDAOImpl();
        User user=null;
        if(reqPage.contains("Ecomerce")){
            HttpSession session=request.getSession();
            String mode=request.getParameter("m");
            String mailId=request.getParameter("mailId");
            String password=request.getParameter("password");
            RequestDispatcher rd=request.getRequestDispatcher("SignUp.jsp");
            if(mode.equals("c")){
                String firstName=request.getParameter("firstName");
                String lastName=request.getParameter("lastName");
                String gender=request.getParameter("gender");
                String dob=request.getParameter("dob");
                String phoneNumber=request.getParameter("phoneNumber");
                String cpassword=request.getParameter("cpassword");
                SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
                if(password.equals(cpassword)){
                    user=new User(firstName, lastName, mailId, gender.charAt(0), sdf.parse(dob), phoneNumber, password);
                    if(ud.create(user)!=1){
                        out.println("Unable to create the User server error !! Please contact the Administrator");
                    }
                }else{
                    out.println("Password mismatch");
                }
                rd.include(request, response);
            }
            if(mode.equals("r")){
                String nextPage="Welcome.jsp";
                String error="";
                user=new User(mailId, password);
                user=ud.read(user);
                
                session.setAttribute("User", user);
                if(user.getId()==0){
                    error="UserId or Password Incorrect";
                    nextPage="SignUp.jsp?e="+error;
                }
                response.sendRedirect(nextPage);
            }
            if(mode.equals("u")){
                String npassword=request.getParameter("npassword");
                user=new User(mailId, password);
                user=ud.read(user);
                user.setPassword(npassword);
                ud.update(user);
                response.sendRedirect("Welcome.jsp");
            }if(mode.equals("l")){
                session.setAttribute("User", null);
                response.sendRedirect("index.jsp");
            }
        }
        }catch(Exception e){
            out.println("Temporaryly out off service");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
