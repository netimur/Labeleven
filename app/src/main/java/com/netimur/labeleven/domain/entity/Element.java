package com.netimur.labeleven.domain.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;

public class Element {

    private int code;
    private String name;
    private Boolean isBase;

    public Element() {
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBase(Boolean base) {
        isBase = base;
    }

    public Element(int code, String name, Boolean isBase) {
        this.code = code;
        this.name = name;
        this.isBase = isBase;
    }


    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Boolean getBase() {
        return isBase;
    }
}
