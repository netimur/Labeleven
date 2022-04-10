package com.netimur.labeleven.domain.entity;

public class BrandComponent {
    private final int brandCode;
    private final int elementCode;
    private final int lowerLimit;
    private final int upperLimit;

    public int getBrandCode() {
        return brandCode;
    }

    public int getElementCode() {
        return elementCode;
    }

    public int getLowerLimit() {
        return lowerLimit;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public BrandComponent(int brandCode, int elementCode, int lowerLimit, int upperLimit) {
        this.brandCode = brandCode;
        this.elementCode = elementCode;
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }
}
