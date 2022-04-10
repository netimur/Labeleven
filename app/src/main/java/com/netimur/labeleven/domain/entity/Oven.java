package com.netimur.labeleven.domain.entity;

public class Oven {
    private final int code;
    private final String name;
    private final int departmentCode;

    public Oven(int code, String name, int departmentCode) {
        this.code = code;
        this.name = name;
        this.departmentCode = departmentCode;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }
}
