package com.exam.examserver.service;

import com.exam.examserver.model.User;
import com.exam.examserver.model.UserRole;

import java.util.Set;

public interface UserService {
    
    // Creating User
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    //get User by Username
    public User getUser(String username);

    // delete User by id
    public void deleteUser(Long userId);
}
