package com.techreturners.BubbleTeaOrderService;

public class BubbleTea {

    private final BubbleTeaTypeEnum bubbleTeaType;
    private final Double unitPrice;

    public BubbleTea(BubbleTeaTypeEnum bubbleTeaType, Double unitPrice) {
        this.bubbleTeaType = bubbleTeaType;
        this.unitPrice = unitPrice;
    }

    public BubbleTeaTypeEnum getBubbleTeaType() {
        return this.bubbleTeaType;
    }

    public Double getUnitPrice() {
        return this.unitPrice;
    }

}
