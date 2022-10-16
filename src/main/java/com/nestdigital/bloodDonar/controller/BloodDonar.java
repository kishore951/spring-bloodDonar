package com.nestdigital.bloodDonar.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BloodDonar {

    @GetMapping("/")
    public String Homepage(){
        return "Welcome To My Home Page";
    }

    @GetMapping("/delete")
    public String DeleteDonar(){
        return "Delete Donar";
    }

    @GetMapping("/add")
    public String AddDonar(){
        return "Add Donar";
    }
}
