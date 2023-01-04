package com.groupware.company.contorller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginContorller {
    @GetMapping("/loginpage")
    public String LoginPage(){
        return "/login/loginpage";
    }

    @PostMapping("/login")
    public String Login(Model model, Authentication authentication){
        System.out.println("aa");
        return "/index";
    }

}
