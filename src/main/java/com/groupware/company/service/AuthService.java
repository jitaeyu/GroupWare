package com.groupware.company.service;

import com.groupware.company.domain.User;

public interface AuthService {
    void signUpUser(User user);
    User loginUser(String email,String password);
}
