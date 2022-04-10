package com.netimur.labeleven.domain.entity;

public class Department {
    private final int code;
    private final String name;
    private final int chiefCode;

    public Department(int code, String name, int chiefCode) {
        this.code = code;
        this.name = name;
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


}
