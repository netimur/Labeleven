package com.netimur.labeleven.domain.entity;

public class Department {
    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChiefCode(int chiefCode) {
        this.chiefCode = chiefCode;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getChiefCode() {
        return chiefCode;
    }

    private int code;
    private String name;
    private int chiefCode;

    public Department(int code, String name, int chiefCode) {
        this.code = code;
        this.name = name;
        this.chiefCode = chiefCode;
    }

    public Department() {
    }

}
