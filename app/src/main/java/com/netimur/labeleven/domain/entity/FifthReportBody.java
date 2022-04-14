package com.netimur.labeleven.domain.entity;

public class FifthReportBody {
    private String elementName;
    private int meltingNumber;

    public String getElementName() {
        return elementName;
    }

    public int getMeltingNumber() {
        return meltingNumber;
    }

    public FifthReportBody(String elementName, int meltingNumber) {
        this.elementName = elementName;
        this.meltingNumber = meltingNumber;
    }

    public FifthReportBody() {
    }
}
