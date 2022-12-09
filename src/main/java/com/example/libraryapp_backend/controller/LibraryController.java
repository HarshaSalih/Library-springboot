package com.example.libraryapp_backend.controller;

import com.example.libraryapp_backend.dao.LibraryDao;
import com.example.libraryapp_backend.model.Library;
//import com.example.libraryapp_backend.model.UserRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LibraryController {

    @Autowired
    private LibraryDao dao;

//    @Autowired
//    private UserRegistration dao1;


//    @CrossOrigin(origins = "*")
//    @PostMapping(path = "/userlogin",consumes = "application/json",produces = "application/json")
//    public List<UserRegistration>UserLogin(@RequestBody UserRegistration u)
//    {
////        String userName=String.valueOf(u.getUserName());
////        String password=String.valueOf(u.getPassword());
////        System.out.println(userName);
////        System.out.println(password);
//        //return (List<UserRegistration>) dao1.UserLogin(u.getUserName(),u.getPassword());
//        return "success";
//    }

//    @CrossOrigin(origins = "*")
//    @PostMapping(path="/userregistration",consumes = "application/json",produces = "application/json")
//    public HashMap<String,String> UserRegistration(@RequestBody UserRegistration r)
//    {
//        System.out.println(r.getName());
//        System.out.println(r.getAadharNo());
//        System.out.println(r.getAddress());
//        System.out.println(r.getPincode());
//        System.out.println(r.getDob());
//        System.out.println(r.getEmail());
//        System.out.println(r.getPhone());
//        System.out.println(r.getUserName());
//        System.out.println(r.getPassword());
//        System.out.println(r.getConfirmPassword());
//        dao1.save(r);
//        HashMap<String,String>map=new HashMap<>();
//        map.put("status","success");
//        return  map;
//    }
//
//    @CrossOrigin(origins = "*")
//    @GetMapping("/adminlogin")
//    public List<UserRegistration>AdminLogin()
//    {
//        return (List<UserRegistration>)dao1.findAll();
//    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/entry",consumes = "application/json",produces = "application/json")
    public Map<String,String> EntryBook(@RequestBody Library l)
    {
        System.out.println(l.getBookTitle().toString());
        dao.save(l);
        HashMap<String,String>map=new HashMap<>();
        map.put("status","success");
        return  map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Library> ViewBook()
    {
        return (List<Library>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<Library> SearchBook(@RequestBody Library l)
    {
        String bookTitle=l.getBookTitle();
        System.out.println(bookTitle);
        return (List<Library>) dao.SearchBook(l.getBookTitle());
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> DeleteBook(@RequestBody Library l)
    {
        String id=String.valueOf(l.getId());
        System.out.println(id);
        dao.DeleteBook(l.getId());
        HashMap<String,String>map=new HashMap<>();
        map.put("status","success");
        return  map;

    }

//    @CrossOrigin(origins = "*")
//    @PostMapping(path = "/edit",consumes = "application/json",produces = "application/json")
//    public HashMap<String,String> EditBook(@RequestBody Library l)
//
//    {
//        String bookTitle=l.getBookTitle();
//        System.out.println(bookTitle);
//        dao.EditBook(l.getBookTitle());
//        HashMap<String,String>map=new HashMap<>();
//        map.put("status","success");
//        return  map;
//    }

//    @CrossOrigin(origins = "*")
//    @PostMapping(path = "/issue",consumes = "application/json",produces = "application/json")
//    public HashMap<String,String> IssueBook(@RequestBody Library l)
//    {
//        System.out.println(l.getBookTitle().toString());
//        dao.save(l);
//        HashMap<String,String>map=new HashMap<>();
//        map.put("status","success");
//        return  map;
//    }



}
