/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecomere.dao;

import com.ecomere.model.Category;
import java.util.List;

/**
 *
 * @author iamsu
 */
public interface CategoryDAO {
    int createCategory(Category c);
    Category readCategory(Category c);
    int updateCategory(Category c);
    int deleteCategory(Category c);
    List<Category> getCategories();
}
