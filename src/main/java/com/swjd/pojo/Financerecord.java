package com.swjd.pojo;

import java.util.Date;

public class Financerecord {
    private Integer financeNo;

    private Integer prescriptionNo;

    @Override
    public String toString() {
        return "Financerecord{" +
                "financeNo=" + financeNo +
                ", prescriptionNo=" + prescriptionNo +
                ", studentName='" + studentName + '\'' +
                ", prescriptionTime=" + prescriptionTime +
//                ", prescriptionTime2=" + prescriptionTime2 +
                ", applyPrice=" + applyPrice +
                ", selfprice=" + selfprice +
                ", amountprice=" + amountprice +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }

    private String studentName;

    private Date prescriptionTime;

//    public Date getPrescriptionTime2() {
//        return prescriptionTime2;
//    }
//
//    public void setPrescriptionTime2(Date prescriptionTime2) {
//        this.prescriptionTime2 = prescriptionTime2;
//    }

//    private Date prescriptionTime2;

    private Integer applyPrice;

    private Integer selfprice;

    private Long amountprice;

    private String doctorName;

    public Integer getFinanceNo() {
        return financeNo;
    }

    public void setFinanceNo(Integer financeNo) {
        this.financeNo = financeNo;
    }

    public Integer getPrescriptionNo() {
        return prescriptionNo;
    }

    public void setPrescriptionNo(Integer prescriptionNo) {
        this.prescriptionNo = prescriptionNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public Date getPrescriptionTime() {
        return prescriptionTime;
    }

    public void setPrescriptionTime(Date prescriptionTime) {
        this.prescriptionTime = prescriptionTime;
    }

    public Integer getApplyPrice() {
        return applyPrice;
    }

    public void setApplyPrice(Integer applyPrice) {
        this.applyPrice = applyPrice;
    }

    public Integer getSelfprice() {
        return selfprice;
    }

    public void setSelfprice(Integer selfprice) {
        this.selfprice = selfprice;
    }

    public Long getAmountprice() {
        return amountprice;
    }

    public void setAmountprice(Long amountprice) {
        this.amountprice = amountprice;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

}