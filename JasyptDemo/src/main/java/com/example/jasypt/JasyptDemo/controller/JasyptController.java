package com.example.jasypt.JasyptDemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JasyptController {

    @Value("${app.user}")
    private String user;

    @Value("${app.pass}")
    private String pass;

    @GetMapping("/")
    public String checkJasypt(){
        return "The user " +user + " and decrypted " + pass + "!!!";
    }

}
