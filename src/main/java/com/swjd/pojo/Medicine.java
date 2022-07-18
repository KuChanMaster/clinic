package com.swjd.pojo;

import java.util.List;

public class Medicine {
    private Integer mno;

    private String mname;

    private String mstyle;

    private Integer mprice;

    private Integer selfpercent;

    //库存
    private List<Storeamount> storeamountList;

    public List<Storeamount> getStoreamountList() {
        return storeamountList;
    }

    public void setStoreamountList(List<Storeamount> storeamountList) {
        this.storeamountList = storeamountList;
    }

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
}