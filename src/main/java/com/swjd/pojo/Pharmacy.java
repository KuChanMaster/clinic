package com.swjd.pojo;

public class Pharmacy {
    private Integer phno;

    private String phname;

    public Integer getPhno() {
        return phno;
    }

    public void setPhno(Integer phno) {
        this.phno = phno;
    }

    public String getPhname() {
        return phname;
    }

    public void setPhname(String phname) {
        this.phname = phname == null ? null : phname.trim();
    }
}