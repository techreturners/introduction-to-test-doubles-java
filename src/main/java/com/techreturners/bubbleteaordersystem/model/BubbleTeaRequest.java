package com.techreturners.bubbleteaordersystem.model;

public class BubbleTeaRequest {

    private final PaymentDetails PAYMENTDETAILS;
    private final BubbleTea BUBBLETEA;

    public BubbleTeaRequest(PaymentDetails paymentDetails, BubbleTea bubbleTea) {
        this.PAYMENTDETAILS = paymentDetails;
        this.BUBBLETEA = bubbleTea;
    }

    public PaymentDetails getPaymentDetails() {
        return this.PAYMENTDETAILS;
    }

    public BubbleTea getBubbleTea() {
        return this.BUBBLETEA;
    }

}
