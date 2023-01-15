package com.groupware.company.serviceImpl;

import com.groupware.company.domain.User;
import com.groupware.company.repository.UserRepository;
import com.groupware.company.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void signUpUser(User user) {
    String email = user.getEmail();
    String name = user.getName();
    String password = user.getPassword();
    user.setEmail(email);
    user.setName(name);
    user.setPassword(password);
    userRepository.save(user);
    }

    @Override
    public User loginUser(String email, String password) {
        return null;
    }
}
