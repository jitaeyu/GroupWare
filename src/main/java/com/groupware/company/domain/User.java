package com.groupware.company.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {

    String name,email,password;
//position    ,phone;
    String role;//직급,권한(사원,팀장,사장)
//    int age;

}
