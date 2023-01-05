package com.groupware.company.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@Entity(name="gw_user")
@NoArgsConstructor
public class User {
    @Id
    String email;
            String name,password;
//position    ,phone;
    String role;//직급,권한(사원,팀장,사장)
//    int age;

}
