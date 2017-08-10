/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecomere.dao;

import com.ecomere.model.User;

/**
 *
 * @author iamsu
 */
public interface UserDAO {
    int create(User u);
    User read(User u);
    int update(User u);
    int delete(User u);
}
