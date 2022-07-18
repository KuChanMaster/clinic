package com.swjd.pojo;

public class Medicineandstoream {
    private Integer mno;

    private String mname;

    private String mstyle;

    private Integer mprice;

    private Integer selfpercent;

    private Integer amount;

    private Integer phno;

    private String phname;

    public Integer getMno() {
        return mno;
    }

    public void setMno(Integer mno) {
        this.mno = mno;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public String getMstyle() {
        return mstyle;
    }

    public void setMstyle(String mstyle) {
        this.mstyle = mstyle == null ? null : mstyle.trim();
    }

    public Integer getMprice() {
        return mprice;
    }

    public void setMprice(Integer mprice) {
        this.mprice = mprice;
    }

    public Integer getSelfpercent() {
        return selfpercent;
    }

    public void setSelfpercent(Integer selfpercent) {
        this.selfpercent = selfpercent;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

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

    @Override
    public String toString() {
        return "Medicineandstoream{" +
                "mno=" + mno +
                ", mname='" + mname + '\'' +
                ", mstyle='" + mstyle + '\'' +
                ", mprice=" + mprice +
                ", selfpercent=" + selfpercent +
                ", amount=" + amount +
                ", phno=" + phno +
                ", phname='" + phname + '\'' +
                '}';
    }
}