package com.swjd.service;

import com.swjd.pojo.Financerecord;
import com.swjd.pojo.ResultPage;

import java.util.List;

public interface FinancialService {

    ResultPage findAllRecords(Integer currPage, int pageSize, Financerecord financerecord);

    Financerecord findByID(Integer financeNo,Integer phno);

    Financerecord findByfid(Integer financeNo);


}
