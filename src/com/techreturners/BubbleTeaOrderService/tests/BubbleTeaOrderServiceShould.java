package com.techreturners.BubbleTeaOrderService.tests;

import com.techreturners.BubbleTeaOrderService.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BubbleTeaOrderServiceShould {

    @Test
    public void create_bubble_tea_order_request() {

        DebitCard debitCard = new DebitCard("0123456789");

        PaymentDetails paymentDetails = new PaymentDetails("hello kitty", "sanrio puroland", debitCard);

        BubbleTea bubbleTea = new BubbleTea(BubbleTeaTypeEnum.OolongMilkTea, 4.5);

        BubbleTeaRequest bubbleTeaRequest = new BubbleTeaRequest(paymentDetails, bubbleTea);

        BubbleTeaOrderService bubbleTeaOrderService = new BubbleTeaOrderService();

        OrderRequest result = bubbleTeaOrderService.createOrderRequest(bubbleTeaRequest);

        OrderRequest expectedResult = new OrderRequest(
                "hello kitty",
                "sanrio puroland",
                "0123456789",
                BubbleTeaTypeEnum.OolongMilkTea);

        assertEquals(expectedResult.getName(), result.getName());
        assertEquals(expectedResult.getAddress(), result.getAddress());
        assertEquals(expectedResult.getDebitCardDigits(), result.getDebitCardDigits());
        assertEquals(expectedResult.getBubbleTeaType(), result.getBubbleTeaType());
    }
}
