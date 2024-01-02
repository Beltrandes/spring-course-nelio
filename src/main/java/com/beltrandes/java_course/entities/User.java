package com.beltrandes.java_course.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "id")
public class User {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;


    public User() {

    }
    public User(Long id, String name, String email, String phone, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }
}
