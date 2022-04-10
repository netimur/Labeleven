package com.netimur.labeleven.domain.entity;

public class Element {
    private int code;
    private String name;
    private Boolean base;


    public Element(int code, String name, Boolean base) {
        this.code = code;
        this.name = name;
        this.base = base;
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

    public Boolean getBase() {
        return base;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isBase() {
        return base;
    }

    public void setBase(Boolean base) {
        this.base = base;
    }
}
