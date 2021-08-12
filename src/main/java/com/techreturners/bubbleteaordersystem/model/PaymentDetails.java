package com.techreturners.bubbleteaordersystem.model;

public class PaymentDetails {

    private final String NAME;
    private final String ADDRESS;
    private final DebitCard DEBITCARD;

    public PaymentDetails(String name, String address, DebitCard debitCard) {
        this.NAME = name;
        this.ADDRESS = address;
        this.DEBITCARD = debitCard;
    }

    public String getName() {
        return this.NAME;
    }

    public String getAddress() {
        return this.ADDRESS;
    }

    public DebitCard getDebitCard() {
        return this.DEBITCARD;
    }

}
