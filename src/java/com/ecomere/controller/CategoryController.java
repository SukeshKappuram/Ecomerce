/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecomere.controller;

import com.ecomere.dao.CategoryDAO;
import com.ecomere.model.Category;
import com.ecomere.service.CategoryDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author iamsu
 */
public class CategoryController extends HttpServlet {

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
        String reqPage=request.getHeader("referer");
        HttpSession session=request.getSession();
        CategoryDAO cd=new CategoryDAOImpl();int i=0;
        if(reqPage.contains("Ecomerce")){
            String mode=request.getParameter("m");out.print(mode);
            if(mode.equals("c") || mode.equals("u")){
                String name=request.getParameter("name");
                String description=request.getParameter("description");
                Category c=new Category(name, description);
                if(mode.equals("c")){
                    cd.createCategory(c);                    
                }
                try{    
                    int id=Integer.parseInt(request.getParameter("Id"));
                    c.setId(id);
                    cd.updateCategory(c);
                }catch(Exception e){out.print(e);}
                session.setAttribute("Category",null);
            }if(mode.equals("e")){
                int id=Integer.parseInt(request.getParameter("id"));
                Category c=new Category();
                c.setId(id);
                session.setAttribute("Category",cd.readCategory(c));
            }if(mode.equals("d")){
                int id=Integer.parseInt(request.getParameter("id"));
                Category c=new Category();
                c.setId(id);
                cd.deleteCategory(c);
            }
            session.setAttribute("categories", cd.getCategories());
            response.sendRedirect("Category.jsp?"+i);
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
