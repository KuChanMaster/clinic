package com.swjd.service;

import com.swjd.pojo.Medicine;
import com.swjd.pojo.Medicineandstoream;
import com.swjd.pojo.ResultPage;
import com.swjd.pojo.Storeamount;

import java.util.List;

public interface MedicineService {
    public ResultPage findAll(Integer currPage, int pageSize, Medicineandstoream medicine);

    void addMedicine(Medicineandstoream medicineandstoream);

    void deleteMedicine(Integer id);

    List<Medicineandstoream> findMedicineByIdAndPno(Integer mno, Integer phno);

    void updatePrice(Medicine medicine);

    public void addAmount(Storeamount storeamount);
}
