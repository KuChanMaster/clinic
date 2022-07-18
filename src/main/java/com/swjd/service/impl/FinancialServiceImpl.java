package com.swjd.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.swjd.mapper.FinancerecordMapper;
import com.swjd.pojo.Financerecord;
import com.swjd.pojo.FinancerecordExample;
import com.swjd.pojo.ResultPage;
import com.swjd.service.FinancialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class FinancialServiceImpl implements FinancialService {
    @Autowired
    FinancerecordMapper financerecordMapper;

    @Override
    public ResultPage findAllRecords(Integer currPage, int pageSize, Financerecord financerecord) {
        ResultPage pages=new ResultPage();
        PageHelper.startPage(currPage,pageSize);
        FinancerecordExample example=new FinancerecordExample();
        FinancerecordExample.Criteria criteria=example.createCriteria();

        if(financerecord!=null){
            System.out.println(financerecord);
            if (financerecord.getFinanceNo()!=null){
                criteria.andFinanceNoEqualTo(financerecord.getFinanceNo());
            }
            if(financerecord.getDoctorName()!=null&&financerecord.getDoctorName()!=""){
                criteria.andDoctorNameEqualTo("%"+financerecord.getDoctorName()+"%");
            }
            if (financerecord.getPrescriptionTime()!=null){
//                criteria.andPrescriptionTimeBetween();
            }

        }

        List<Financerecord> financerecords = financerecordMapper.selectByExample(example);
        PageInfo<Financerecord> info=new PageInfo<Financerecord>(financerecords);
        pages.setCurrPage(info.getPageNum());
        pages.setPage(info.getPages());
        pages.setPageList(info.getList());
        pages.setPageSize(info.getPageSize());
        pages.setTotal(info.getTotal());
        return pages;
    }

    @Override
    public Financerecord findByID(Integer financeNo,Integer phno) {
//        FinancerecordExample example=new FinancerecordExample();
//        FinancerecordExample.Criteria criteria=example.createCriteria();
//        criteria.andFinanceNoEqualTo(financeNo);
//        criteria.andPrescriptionNoEqualTo(phno);
        Financerecord financerecords = financerecordMapper.selectByFinanceNo(financeNo);

        System.out.println(financerecords);
        return financerecords;
    }

    @Override
    public Financerecord findByfid(Integer financeNo) {
        FinancerecordExample example=new FinancerecordExample();
        FinancerecordExample.Criteria criteria=example.createCriteria();
        criteria.andFinanceNoEqualTo(financeNo);
        List<Financerecord> financerecords = financerecordMapper.selectByExample(example);
        System.out.println(financerecords.get(0));
        return financerecords.get(0);
    }


}
