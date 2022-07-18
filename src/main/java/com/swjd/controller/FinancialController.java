package com.swjd.controller;

import com.swjd.pojo.Financerecord;
import com.swjd.pojo.ResultPage;
import com.swjd.service.FinancialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/financial")
public class FinancialController {
    @Autowired
    FinancialService financialService;


    @RequestMapping("/findAll/{currPage}")
    @ResponseBody
    public ResultPage findAllFinancial(@PathVariable("currPage") Integer currPage, Financerecord financerecord){
       ResultPage page= financialService.findAllRecords(currPage,5,financerecord);
        return page;
    }

    @RequestMapping("/find/{financeNo}")
    @ResponseBody
    public Financerecord findRecordById(Integer financeNo){
        return financialService.findByfid(financeNo);

    }

}
