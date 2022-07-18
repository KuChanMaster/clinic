package com.swjd.service.impl;

import com.swjd.mapper.PharmacyMapper;
import com.swjd.pojo.Pharmacy;
import com.swjd.pojo.PharmacyExample;
import com.swjd.service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PharmacyServiceImpl implements PharmacyService {
    @Autowired
    PharmacyMapper mapper;

    @Override
    public List<Pharmacy> findAll() {
        PharmacyExample example=new PharmacyExample();
        return mapper.selectByExample(example);
    }
}
