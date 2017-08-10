/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecomere.db;

import java.sql.*;

/**
 *
 * @author iamsu
 */
public class DataSource {
    private Connection con;
    private PreparedStatement ps; 
    public static final String URL="jdbc:odbc:emc";
    
    public Connection getCon() {
        return con;
    }

    public void setCon() throws SQLException{
        this.con = DriverManager.getConnection(URL);
    }

    public PreparedStatement getPs() {
        return ps;
    }

    public void setPs(String query) throws SQLException {
        this.ps = con.prepareStatement(query);
    }
    
    
}
