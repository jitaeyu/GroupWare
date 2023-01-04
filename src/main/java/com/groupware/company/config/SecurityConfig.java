package com.groupware.company.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf()
                    .disable()
                .authorizeRequests()
                .antMatchers("/loginpage")
                    .permitAll()
                    .anyRequest().authenticated()
                .and()
                .formLogin()//Form 로그인 인증 기능이 작동함
                    .loginPage("/loginpage")//사용자 정의 로그인 페이지
                    .loginProcessingUrl("/login")//로그인 Form Action Url
//                    .defaultSuccessUrl("/home")//로그인 성공 후 이동 페이지
//                .failureUrl("/loginpage.html?error=true")// 로그인 실패 후 이동 페이지
                    .usernameParameter("email")//아이디 파라미터명 설정
                    .passwordParameter("password")//패스워드 파라미터명 설정
                .successHandler(new LoginSuccessHandler());//로그인 성공 후 핸들러 (해당 핸들러를 생성하여 핸들링 해준다.)
//                .failureHandler(loginFailureHandler());//로그인 실패 후 핸들러 (해당 핸들러를 생성하여 핸들링 해준다.)
//							.permitAll(); //사용자 정의 로그인 페이지 접근 권한 승인
    }


    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
                .requestMatchers(PathRequest.toStaticResources().atCommonLocations());
    }
    //css나 js,이미지 파일등 시큐리티에 검열을 받지 않게한다
}
