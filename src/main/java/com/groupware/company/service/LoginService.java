package com.groupware.company.service;

import com.groupware.company.domain.User;
import com.groupware.company.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoginService{

    @Autowired
    UserRepository userRepository;


//    public List<UserDTO> FindById() {
//       return userRepository.findById();
//    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
