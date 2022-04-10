package com.netimur.labeleven.domain.entity;

public class Employee {
    private int code;
    private String name;
    private int departmentCode;


    public Employee(int code, String name, int departmentCode) {
        this.code = code;
        this.name = name;
        this.departmentCode = departmentCode;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }
}
