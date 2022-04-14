package com.netimur.labeleven.domain.entity;

public class SixthReportBody {
    private String name;
    private double quantity;

    public SixthReportBody(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }
}
