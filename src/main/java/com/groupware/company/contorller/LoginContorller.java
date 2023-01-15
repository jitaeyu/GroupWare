package com.groupware.company.contorller;

import com.groupware.company.domain.User;
import com.groupware.company.service.AuthService;
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
    private AuthService authService;



    @GetMapping("/loginpage")
    public String LoginPage(Model model){

        return "/login/loginpage";
    }
    @GetMapping("/signpage")
    public String Sign(Model model){
        return "/sign/signinpage";
    }

    @PostMapping("/signin")
    public String SignIn(User user){

        authService.signUpUser(user);
        System.out.println("가입완료");
        return "/login/loginpage";
    }


    @PostMapping("/login")
    public String Login(Model model, Authentication authentication){
//        List<User> list = loginService.findAll();
//        for(User k:list) {
//            System.out.println(k);
//        }
//        model.addAttribute("list",list);

        System.out.println("aa");
        return "/index";
    }

}
