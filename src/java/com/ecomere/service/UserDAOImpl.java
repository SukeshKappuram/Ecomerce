/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecomere.service;

import com.ecomere.dao.UserDAO;
import com.ecomere.db.DataSource;
import com.ecomere.model.User;
import java.sql.Date;
import java.sql.ResultSet;

/**
 *
 * @author iamsu
 */
public class UserDAOImpl implements UserDAO{

    DataSource ds=new DataSource();
    
    @Override
    public int create(User u) {
        try{
            ds.setCon();
            ds.setPs("insert into e_Users(id,firstName,lastName,mailId,gender,dob,phoneNumber,password) values(e_users_seq.NEXTVAL,?,?,?,?,?,?,?)");
            ds.getPs().setString(1, u.getFirstName());
            ds.getPs().setString(2, u.getLastName());
            ds.getPs().setString(3,u.getMailId());
            ds.getPs().setString(4, String.valueOf(u.getGender()));
            ds.getPs().setDate(5, new Date(u.getDob().getYear(), u.getDob().getMonth(), u.getDob().getDay()));
            ds.getPs().setString(6, u.getPhoneNumber());
            ds.getPs().setString(7, u.getPassword());
            int i=ds.getPs().executeUpdate();
            ds.getCon().commit();
            ds.getCon().close();
            return i;
        }catch(Exception e){
            System.out.println(e);
        }
        return 0;
    }

    @Override
    public User read(User u) {
        try{
            ds.setCon();
            ds.setPs("select * from e_Users where mailId=?");
            ds.getPs().setString(1,u.getMailId());
            ResultSet rs=ds.getPs().executeQuery();
            if(rs.next()){
                if(u.getPassword().equals(rs.getString("password"))){
                    u.setId(rs.getInt("Id"));
                    u.setFirstName(rs.getString("firstName"));
                    u.setLastName(rs.getString("lastName"));
                    u.setGender(rs.getString("gender").charAt(0));
                    u.setDob(rs.getDate("dob"));
                    u.setPhoneNumber(rs.getString("phoneNumber"));
                }
            }
            ds.getCon().close();
        }catch(Exception e){
            System.out.println(e);
        }
        return u;
    }

    @Override
    public int update(User u) {
        try{
            ds.setCon();
            ds.setPs("update e_Users set password=? where id=?");
            ds.getPs().setString(1, u.getPassword());
            ds.getPs().setInt(2, u.getId());
            int i=ds.getPs().executeUpdate();
            ds.getCon().commit();
            ds.getCon().close();
            return i;
        }catch(Exception e){
            System.out.println(e);
        }
        return 0;
    }

    @Override
    public int delete(User u) {
        try{
            ds.setCon();
            ds.setPs("delete from e_Users where Id=?");
            ds.getPs().setInt(1, u.getId());
            int i=ds.getPs().executeUpdate();
            ds.getCon().commit();
            ds.getCon().close();
            return i;
        }catch(Exception e){
            System.out.println(e);
        }
        return 0;
    }
    
}
