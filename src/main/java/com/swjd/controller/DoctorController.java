package com.swjd.controller;

import com.swjd.pojo.Doctor;
import com.swjd.pojo.ResultPage;
import com.swjd.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    DoctorService doctorService;

    @RequestMapping("/findAll/{currPage}")
    @ResponseBody
    public ResultPage getStudentAll(@PathVariable("currPage") Integer currPage,Doctor doctor) {
        ResultPage page = doctorService.findAll(currPage, 5, doctor);
        return page;
    }

    @RequestMapping("/room")
    @ResponseBody
    public List<String> getCollege() {

        return doctorService.findRoom();
    }
//    @RequestMapping("/classname/{collegeName}")
//    @ResponseBody
//    public List<String> getClassname(@PathVariable("collegeName") String collegeName) {
//
//        return studentService.findClassName(collegeName);
//    }

    @RequestMapping("/delete/{id}")
    @ResponseBody
    public String deleteStu(@PathVariable("id") Integer id) {
        try {
            doctorService.deleteStu(id);
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
        return "ok";
    }

    @RequestMapping("/add")
    @ResponseBody
    public String addStu(Doctor doctor) {
  System.out.println(doctor.getRoom() + " " + doctor.getDname() + " " + doctor.getDsex());
        try {
            doctor.setPassword("000000");
            doctorService.addDoc(doctor);
        } catch (Exception e) {
            return "fail";
        }
        return "ok";
    }
    @RequestMapping("/find/{id}")
    @ResponseBody
    public Doctor findStuById(@PathVariable("id")Integer id) {

        return doctorService.findById(id);
    }
    @RequestMapping("/update")
    @ResponseBody
    public String updateStu(Doctor doctor){
        try {
            doctorService.updateDoc(doctor);
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
            return "ok";
    }
}