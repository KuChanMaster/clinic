package com.swjd.controller;

import com.swjd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/page")
public class PageController {

    @RequestMapping("/signin")
    public String toSignin(){
        return "signin";
    };

    @RequestMapping("/toStudent")
    public String toStudent(){
        return "student";
    }

    @RequestMapping("/toDoctor")
    public String toDoctor(){
        return "doctor";
    }

    @RequestMapping("/toIndex")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/toMedicine")
    public String toMedicine(){
        return "medicine";
    }

    @RequestMapping("/toPrescription")
    public String toPrescription(){
        return "prescription";
    }

    @RequestMapping("/toFinancial")
    public String toFinancial(){
        return "financial";
    }

}
