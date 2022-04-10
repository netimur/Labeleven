package com.netimur.labeleven.domain.entity;

public class MeltingBrand {
    private final int brandCode;
    private final String brandName;

    public int getBrandCode() {
        return brandCode;
    }

    public String getBrandName() {
        return brandName;
    }

    public MeltingBrand(int brandCode, String brandName) {
        this.brandCode = brandCode;
        this.brandName = brandName;
    }
}
