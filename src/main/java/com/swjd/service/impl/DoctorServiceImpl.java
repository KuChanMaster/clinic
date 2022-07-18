package com.swjd.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.swjd.exception.UserNotFoundException;
import com.swjd.mapper.DoctorMapper;
import com.swjd.pojo.Doctor;
import com.swjd.pojo.DoctorExample;
import com.swjd.pojo.ResultPage;
import com.swjd.pojo.Student;
import com.swjd.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    DoctorMapper mapper;
    public Doctor login(Integer id,String password) throws UserNotFoundException {
        DoctorExample example=new DoctorExample();
        DoctorExample.Criteria criteria=example.createCriteria();

        criteria.andDnoEqualTo(id);
        criteria.andPasswordEqualTo(password);

        List<Doctor> doctors=mapper.selectByExample(example);
        if(doctors==null||doctors.size()<=0){
            throw new UserNotFoundException("id错误或用户不存在");
        }
        return doctors.get(0);
    }



    @Override
    public ResultPage findAll(Integer currPage, Integer pageSize, Doctor doctor) {
        ResultPage page=new ResultPage();
        PageHelper.startPage(currPage,pageSize);
        DoctorExample example=new DoctorExample();

        List<Doctor> doctors=mapper.selectByExample(example);

        PageInfo<Doctor> info=new PageInfo<Doctor>(doctors);

        page.setCurrPage(info.getPageNum());
        page.setPage(info.getPages());
        page.setPageList(info.getList());
        page.setPageSize(info.getPageSize());
        page.setTotal(info.getTotal());
        return page;
    }

    @Override
    public List<String> findRoom() {
       return  mapper.selectRoom();
    }

    @Override
    public void addDoc(Doctor doctor) {
        mapper.insertSelective(doctor);
    }

    @Override
    public void deleteStu(Integer id) {
        mapper.deleteByPrimaryKey(id);
    }

    @Override
    public Doctor findById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateDoc(Doctor doctor) {
        Doctor doc=findById(doctor.getDno());
        doctor.setPassword(doc.getPassword());
        mapper.updateByPrimaryKey(doctor);
    }


}
