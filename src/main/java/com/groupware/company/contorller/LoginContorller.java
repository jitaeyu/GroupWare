package com.groupware.company.contorller;

import com.groupware.company.domain.User;
import com.groupware.company.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class LoginContorller {

    @Autowired
    private LoginService loginService;

    public LoginContorller(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/loginpage")
    public String LoginPage(Model model){

        return "/login/loginpage";
    }

    @PostMapping("/login")
    public String Login(Model model, Authentication authentication){
        List<User> list = loginService.findAll();
        for(User k:list) {
            System.out.println(k);
        }
        model.addAttribute("list",list);

        System.out.println("aa");
        return "/index";
    }

}
