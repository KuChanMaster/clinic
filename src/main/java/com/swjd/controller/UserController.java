package com.swjd.controller;

import com.swjd.exception.UserNotFoundException;
import com.swjd.pojo.Doctor;
import com.swjd.pojo.Student;
import com.swjd.service.DoctorService;
import com.swjd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    DoctorService doctorService;

    @Autowired
    StudentService studentService;

    @RequestMapping("/signin")
    public String signin(Integer id,String password,Integer job) throws UserNotFoundException {
        System.out.println(id+"\t"+password);
        if(job==1){
            Doctor doctor=doctorService.login(id,password);
            System.out.println("doctor");
        }else if(job==2){
           Student student= studentService.login(id,password);
            System.out.println("student");
        }else {
            System.out.println("root user");
        }
        return "index";
    }
}
