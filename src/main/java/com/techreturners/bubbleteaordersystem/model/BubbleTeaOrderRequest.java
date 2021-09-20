package com.techreturners.bubbleteaordersystem.model;

public class BubbleTeaOrderRequest {

    private final String NAME;
    private final String ADDRESS;
    private final String DEBITCARDDIGITS;
    private final BubbleTeaTypeEnum BUBBLETEATYPE;

    public BubbleTeaOrderRequest(
            String name,
            String address,
            String debitCardDigits,
            BubbleTeaTypeEnum bubbleTeaType) {
        this.NAME = name;
        this.ADDRESS = address;
        this.DEBITCARDDIGITS = debitCardDigits;
        this.BUBBLETEATYPE = bubbleTeaType;
    }

    public String getName() {
        return this.NAME;
    }

    public String getAddress() {
        return this.ADDRESS;
    }

    public String getDebitCardDigits() {
        return this.DEBITCARDDIGITS;
    }

    public BubbleTeaTypeEnum getBubbleTeaType() {
        return this.BUBBLETEATYPE;
    }

}
