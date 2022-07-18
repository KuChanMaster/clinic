package com.swjd.controller;

import com.swjd.pojo.Medicine;
import com.swjd.pojo.ResultPage;
import com.swjd.pojo.Storeamount;
import com.swjd.service.MedicineService;
import com.swjd.pojo.Medicineandstoream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/medicine")
public class MedicineController {

    @Autowired
    MedicineService medicineService;

    @RequestMapping("/findAll/{currPage}")
    @ResponseBody
    public ResultPage getfindAll(@PathVariable("currPage") Integer currPage,Medicineandstoream  medicine) {
        ResultPage page =  medicineService.findAll(currPage, 5,  medicine);
        return page;
    }

    @RequestMapping("/delete/{id}")
    @ResponseBody
    public String deleteMedicine(@PathVariable("id") Integer id) {
        try {
             medicineService.deleteMedicine(id);
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
        return "ok";
    }

    @RequestMapping("/add")
    @ResponseBody
    public String addMedicine(Medicineandstoream medicine) {
        try {
            System.out.println(medicine);
            medicineService.addMedicine(medicine);
        } catch (Exception e) {
            return "fail";
        }
        return "ok";
    }
    @RequestMapping("/findmedicine/{mno}/{phno}")
    @ResponseBody
    public List<Medicineandstoream> findMedicineByIDAndPno(@PathVariable Integer mno,@PathVariable Integer phno){
        return medicineService.findMedicineByIdAndPno(mno,phno);
    }
    @RequestMapping("/update")
    @ResponseBody
    public String updateMedicinePrice(Medicine medicine){
        try {
            medicineService.updatePrice(medicine);
        }catch (Exception e){
            return "fail";
        }
        return "ok";
    }

    @RequestMapping("/addAmount")
    @ResponseBody
    public String addMedicineAmount(Storeamount storeamount){
        try {
            medicineService.addAmount(storeamount);
        }catch (Exception e){
            return "fail";
        }
        return "ok";
    }
}
