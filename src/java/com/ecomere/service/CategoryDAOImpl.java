/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecomere.service;

import com.ecomere.dao.CategoryDAO;
import com.ecomere.db.DataSource;
import com.ecomere.model.Category;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iamsu
 */
public class CategoryDAOImpl implements CategoryDAO{

    DataSource ds=new DataSource();
    
    @Override
    public int createCategory(Category c) {
        try{
            ds.setCon();
            ds.setPs("insert into e_Categories(Id,name,description) values(e_Categories_seq.NEXTVAL,?,?)");
            ds.getPs().setString(1, c.getName());
            ds.getPs().setString(2, c.getDescription());
            int i=ds.getPs().executeUpdate();
            ds.getCon().commit();
            ds.getCon().close();
            return i;
        }catch(Exception e){}
        return 0;
    }

    @Override
    public Category readCategory(Category c) {
        try{
            ds.setCon();
            ds.setPs("select * from e_Categories where Id=?");
            ds.getPs().setInt(1, c.getId());
            ResultSet rs=ds.getPs().executeQuery();
            if(rs.next()){
                c.setName(rs.getString("name"));
                c.setDescription(rs.getString("description"));
            }
        }catch(Exception e){
            
        }
        return c;
    }

    @Override
    public int updateCategory(Category c) {
        try{
            ds.setCon();
            ds.setPs("update e_Categories set name=?,description=? where id=?");
            ds.getPs().setString(1, c.getName());
            ds.getPs().setString(2, c.getDescription());
            ds.getPs().setInt(3, c.getId());
            int i=ds.getPs().executeUpdate();
            ds.getCon().commit();
            ds.getCon().close();
            return i;
        }catch(Exception e){}
        return 0;
    }

    @Override
    public int deleteCategory(Category c) {
        try{
            ds.setCon();
            ds.setPs("delete from e_Categories where id=?");
            ds.getPs().setInt(1, c.getId());
            int i=ds.getPs().executeUpdate();
            ds.getCon().commit();
            ds.getCon().close();
            return i;
        }catch(Exception e){}
        return 0;
    }
   
    public static void main(String[] arg){
        Category c=new Category("Mobiles", "Smart Phones etc");
        CategoryDAO cd=new CategoryDAOImpl();
        cd.createCategory(c);
    }

    @Override
    public List<Category> getCategories() {
        List<Category> categories=new ArrayList<Category>();
        try{
            ds.setCon();
            ds.setPs("select * from e_Categories");
            ResultSet rs=ds.getPs().executeQuery();
            while(rs.next()){
                Category c=new Category();
                c.setId(rs.getInt("Id"));
                c.setName(rs.getString("name"));
                c.setDescription(rs.getString("description"));
                categories.add(c);
            }
        }catch(Exception e){
            
        }
        return categories;
    }
}
