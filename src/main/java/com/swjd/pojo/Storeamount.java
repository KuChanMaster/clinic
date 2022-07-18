package com.swjd.pojo;

import java.util.List;

public class Storeamount extends StoreamountKey {
    private Integer amount;

    private List<Pharmacy> pharmacyList;

    public List<Pharmacy> getPharmacyList() {
        return pharmacyList;
    }

    public void setPharmacyList(List<Pharmacy> pharmacyList) {
        this.pharmacyList = pharmacyList;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}