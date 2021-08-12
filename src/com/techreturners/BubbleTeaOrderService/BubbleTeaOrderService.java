package com.techreturners.BubbleTeaOrderService;

public class BubbleTeaOrderService {

    private SimpleLoggerImpl simpleLogger;

    public BubbleTeaOrderService(SimpleLoggerImpl simpleLogger) {
        this.simpleLogger = simpleLogger;
    }

    public OrderRequest createOrderRequest(BubbleTeaRequest bubbleTeaRequest) {

        simpleLogger.addLoggingText("Creating an Order Request for the " +
                "following Bubble Tea Request " + bubbleTeaRequest.toString());

        var orderRequest = new OrderRequest(
            bubbleTeaRequest.getPaymentDetails().getName(),
            bubbleTeaRequest.getPaymentDetails().getAddress(),
            bubbleTeaRequest.getPaymentDetails().getDebitCard().getDigits(),
            bubbleTeaRequest.getBubbleTea().getBubbleTeaType()
        );

        simpleLogger.addLoggingText("The following Bubble Tea Order Request has been created "
                + bubbleTeaRequest.toString());

        return orderRequest;

    }

}
