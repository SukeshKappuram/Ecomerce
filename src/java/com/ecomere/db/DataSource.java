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
    private static final String URL="jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USER="hr";
    private static final String PASS="hr";
    
    public Connection getCon() throws SQLException{
        return con;
    }

    public void setCon() throws SQLException, ClassNotFoundException{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        this.con = DriverManager.getConnection(URL,USER,PASS);
    }

    public PreparedStatement getPs() {
        return ps;
    }

    public void setPs(String query) throws SQLException {
        this.ps = con.prepareStatement(query);
    }
    
    
}
