package com.example.libraryapp_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LibraryController {

   @PostMapping("/")
    public String Administratorlogin()
    {
        return "Welcome to administrator login page";
    }

}
