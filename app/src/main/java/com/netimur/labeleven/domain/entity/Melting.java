package com.netimur.labeleven.domain.entity;

import java.sql.Date;

public class Melting {
    private int code;
    private int brandCode;
    private int workerCode;
    private int departmentCode;
    private int ovenCode;
    private Date date;
    private String note;
    private float quantity;

    @Override
    public String toString() {
        return "\nMelting:" +
                "code=" + code +
                ", brandCode=" + brandCode +
                ", workerCode=" + workerCode +
                ", departmentCode=" + departmentCode +
                ", ovenCode=" + ovenCode +
                ", date=" + date +
                ", note='" + note + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public Melting() {
    }

    public Melting(int code, int brandCode, int workerCode, int departmentCode, int ovenCode, Date date, String note, float quantity) {
        this.code = code;
        this.brandCode = brandCode;
        this.workerCode = workerCode;
        this.departmentCode = departmentCode;
        this.ovenCode = ovenCode;
        this.date = date;
        this.note = note;
        this.quantity = quantity;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(int brandCode) {
        this.brandCode = brandCode;
    }

    public int getWorkerCode() {
        return workerCode;
    }

    public void setWorkerCode(int workerCode) {
        this.workerCode = workerCode;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }

    public int getOvenCode() {
        return ovenCode;
    }

    public void setOvenCode(int ovenCode) {
        this.ovenCode = ovenCode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }
}
