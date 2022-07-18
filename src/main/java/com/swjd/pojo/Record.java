package com.swjd.pojo;

import java.util.Date;

public class Record extends RecordKey {
    private Date date;

    private Integer selfprice;

    private Integer freeprice;

    private Integer sno;

    private Integer dno;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getSelfprice() {
        return selfprice;
    }

    public void setSelfprice(Integer selfprice) {
        this.selfprice = selfprice;
    }

    public Integer getFreeprice() {
        return freeprice;
    }

    public void setFreeprice(Integer freeprice) {
        this.freeprice = freeprice;
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public Integer getDno() {
        return dno;
    }

    public void setDno(Integer dno) {
        this.dno = dno;
    }
}