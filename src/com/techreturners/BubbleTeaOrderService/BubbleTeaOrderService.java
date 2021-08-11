package com.techreturners.BubbleTeaOrderService;

public class BubbleTeaOrderService {

    public BubbleTeaOrderService() {
    }

    public OrderRequest createOrderRequest(BubbleTeaRequest bubbleTeaRequest) {

        return new OrderRequest(
            bubbleTeaRequest.getPaymentDetails().getName(),
            bubbleTeaRequest.getPaymentDetails().getAddress(),
            bubbleTeaRequest.getPaymentDetails().getDebitCard().getDigits(),
            bubbleTeaRequest.getBubbleTea().getBubbleTeaType()
        );

    }

}
