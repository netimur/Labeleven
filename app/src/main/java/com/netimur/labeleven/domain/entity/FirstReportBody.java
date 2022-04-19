package com.netimur.labeleven.domain.entity;

public class FirstReportBody {
    private int brandCode;
    private int elementCode;
    private int averageValue;

    public FirstReportBody() {
    }

    public int getBrandCode() {
        return brandCode;
    }

    public int getElementCode() {
        return elementCode;
    }

    public int getAverageValue() {
        return averageValue;
    }

    public FirstReportBody(int brandCode, int elementCode, int averageValue) {
        this.brandCode = brandCode;
        this.elementCode = elementCode;
        this.averageValue = averageValue;

    }

    @Override
    public String toString() {
        return "FirstReportBody{" +
                "brandCode=" + brandCode +
                ", elementCode=" + elementCode +
                ", averageValue=" + averageValue +
                '}';
    }
}
