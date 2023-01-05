package com.groupware.company.config;

import org.springframework.security.core.Authentication;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginSuccessHandler implements org.springframework.security.web.authentication.AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
//        HttpSession session = request.getSession();
//        session.setAttribute("loginname", authentication.getName()+"님 반갑습니다.");
//        response.("/login");
        RequestDispatcher rd = request.getRequestDispatcher("/login");
        rd.forward(request,response);
    }
}
