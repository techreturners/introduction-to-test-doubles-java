package com.techreturners.bubbleteaordersystem.model;

public class BubbleTeaOrderRequest {

    private final String name;
    private final String address;
    private final String debitCardDigits;
    private final BubbleTeaTypeEnum bubbleTeaType;

    public BubbleTeaOrderRequest(
            String name,
            String address,
            String debitCardDigits,
            BubbleTeaTypeEnum bubbleTeaType) {
        this.name = name;
        this.address = address;
        this.debitCardDigits = debitCardDigits;
        this.bubbleTeaType = bubbleTeaType;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getDebitCardDigits() {
        return this.debitCardDigits;
    }

    public BubbleTeaTypeEnum getBubbleTeaType() {
        return this.bubbleTeaType;
    }

}
