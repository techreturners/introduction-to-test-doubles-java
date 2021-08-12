package com.techreturners.BubbleTeaOrderService;

public class PaymentDetails {

    private final String name;
    private final String address;
    private final DebitCard debitCard;

    public PaymentDetails(String name, String address, DebitCard debitCard) {
        this.name = name;
        this.address = address;
        this.debitCard = debitCard;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public DebitCard getDebitCard() {
        return this.debitCard;
    }

}
