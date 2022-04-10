package com.netimur.labeleven.domain.entity;

public class ImpurityMelting {
    private final int meltingNumber;
    private final int elementCode;
    private final float quantity;

    public int getMeltingNumber() {
        return meltingNumber;
    }

    public int getElementCode() {
        return elementCode;
    }

    public float getQuantity() {
        return quantity;
    }

    public ImpurityMelting(int meltingNumber, int elementCode, float quantity) {
        this.meltingNumber = meltingNumber;
        this.elementCode = elementCode;
        this.quantity = quantity;
    }
}
