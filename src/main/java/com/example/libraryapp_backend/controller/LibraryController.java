package com.example.libraryapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LibraryController {

   @PostMapping("/")
    public String Administratorlogin()
    {
        return "Welcome to administrator login page";
    }

    @PostMapping("/userregistration")
    public String Userregistration()
    {
        return "Welcome to user registration page";
    }

    @PostMapping("/userlogin")
    public String Userlogin()
    {
        return "Welcome to user login page";
    }

    @PostMapping("/entry")
    public String Entrybook()
    {
        return "Welcome to book entry page";
    }

    @GetMapping("/view")
    public String Viewbook()
    {
        return "Welcome to book view page";
    }

    @PostMapping("/search")
    public String Searchbook()
    {
        return "Welcome to book search page";
    }

    @PostMapping("/delete")
    public String Deletebook()
    {
        return "Welcome to book delete page";
    }

    @PostMapping("/edit")
    public String Editbook()
    {
        return "Welcome to book edit page";
    }



}
