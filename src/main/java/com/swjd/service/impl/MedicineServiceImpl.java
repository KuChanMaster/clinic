package com.swjd.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.swjd.mapper.MedicineMapper;
import com.swjd.mapper.MedicineandstoreamMapper;
import com.swjd.mapper.StoreamountMapper;
import com.swjd.pojo.*;
import com.swjd.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineServiceImpl implements MedicineService {
    @Autowired
    MedicineandstoreamMapper medicineandstoreamMapper;

    @Autowired
    StoreamountMapper storeamountMapper;

    @Autowired
    MedicineMapper medicineMapper;

    @Override
    public ResultPage findAll(Integer currPage, int pageSize, Medicineandstoream medicine) {
        ResultPage page = new ResultPage();
        PageHelper.startPage(currPage, pageSize);
        MedicineandstoreamExample example = new MedicineandstoreamExample();
        MedicineandstoreamExample.Criteria criteria = example.createCriteria();
        if (medicine != null) {

//System.out.println(medicine.getMno()+medicine.getMname()+medicine.getMstyle()+medicine.getMprice());

            if (medicine.getMno() != null) {
                criteria.andMnoEqualTo(medicine.getMno());
            }
            if (medicine.getMname() != null && medicine.getMname() != "") {
                criteria.andMnameLike("%" + medicine.getMname() + "%");
            }
            if (medicine.getMstyle() != null && medicine.getMstyle() != "") {
                criteria.andMstyleLike("%" + medicine.getMstyle() + "%");
            }
            if (medicine.getPhname() != null && medicine.getPhname() != "") {
                criteria.andPhnameEqualTo(medicine.getPhname());
            }
        }

        List<Medicineandstoream> medicineandstoreams = medicineandstoreamMapper.selectByExample(example);
        PageInfo<Medicineandstoream> info = new PageInfo<Medicineandstoream>(medicineandstoreams);

        page.setCurrPage(info.getPageNum());
        page.setPage(info.getPages());
        page.setPageList(info.getList());
        page.setPageSize(info.getPageSize());
        page.setTotal(info.getTotal());

        return page;
    }

    @Override
    public void addMedicine(Medicineandstoream medicineandstoream) {
        System.out.println("dao" + medicineandstoream);
        Medicine medicine = new Medicine();

        medicine.setMname(medicineandstoream.getMname());
        medicine.setMstyle(medicineandstoream.getMstyle());
        medicine.setMprice(medicineandstoream.getMprice());
        medicine.setSelfpercent(medicineandstoream.getSelfpercent());
        medicineMapper.insertSelective(medicine);

        Storeamount storeamount = new Storeamount();
        storeamount.setAmount(medicineandstoream.getAmount());
        storeamount.setPhno(medicineandstoream.getPhno());
        storeamount.setMno(medicine.getMno());
        storeamountMapper.insertSelective(storeamount);

    }

    @Override
    public void deleteMedicine(Integer id) {
        StoreamountExample example = new StoreamountExample();
        StoreamountExample.Criteria criteria = example.createCriteria();
        criteria.andMnoEqualTo(id);
        storeamountMapper.deleteByExample(example);
        medicineMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Medicineandstoream> findMedicineByIdAndPno(Integer mno, Integer phno) {
        MedicineandstoreamExample example = new MedicineandstoreamExample();
        MedicineandstoreamExample.Criteria criteria = example.createCriteria();
        criteria.andMnoEqualTo(mno);
        criteria.andPhnoEqualTo(phno);
        List<Medicineandstoream> medicineandstoreams = medicineandstoreamMapper.selectByExample(example);
        return medicineandstoreams;

    }

    @Override
    public void updatePrice(Medicine medicine) {
        medicineMapper.updateByPrimaryKey(medicine);
    }

    @Override
    public void addAmount(Storeamount storeamount) {
        StoreamountExample example = new StoreamountExample();
        StoreamountExample.Criteria criteria=example.createCriteria();
        criteria.andMnoEqualTo(storeamount.getMno());
        criteria.andPhnoEqualTo(storeamount.getPhno());
        List<Storeamount> storeamountList= storeamountMapper.selectByExample(example);
         Integer oldAmount=storeamount.getAmount();
         Integer inputAmount=storeamountList.get(0).getAmount();
         storeamount.setAmount(oldAmount+inputAmount);
        storeamountMapper.updateByExample(storeamount,example);
    }
}
