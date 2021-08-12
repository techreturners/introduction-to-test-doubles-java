package com.techreturners.BubbleTeaOrderService;

public class BubbleTeaRequest {

    private final PaymentDetails paymentDetails;
    private final BubbleTea bubbleTea;

    public BubbleTeaRequest(PaymentDetails paymentDetails, BubbleTea bubbleTea) {
        this.paymentDetails = paymentDetails;
        this.bubbleTea = bubbleTea;
    }

    public PaymentDetails getPaymentDetails() {
        return this.paymentDetails;
    }

    public BubbleTea getBubbleTea() {
        return this.bubbleTea;
    }

}
