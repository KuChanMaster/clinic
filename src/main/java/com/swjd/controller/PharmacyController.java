package com.swjd.controller;

import com.swjd.pojo.Pharmacy;
import com.swjd.service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/pharmacy")
public class PharmacyController {
    @Autowired
    PharmacyService service;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<Pharmacy> findAll(){
        return service.findAll();
    }
}
