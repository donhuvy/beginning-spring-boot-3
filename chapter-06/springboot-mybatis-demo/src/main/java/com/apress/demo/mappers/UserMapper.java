/**
 *
 */
package com.apress.demo.mappers;

import com.apress.demo.domain.User;

import java.util.List;

/**
 * @author Siva
 *
 */
public interface UserMapper {

    void insertUser(User user);

    User findUserById(Integer id);

    List<User> findAllUsers();

}
