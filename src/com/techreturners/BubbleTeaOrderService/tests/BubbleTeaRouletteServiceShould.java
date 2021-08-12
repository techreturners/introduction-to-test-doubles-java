package com.techreturners.BubbleTeaOrderService.tests;

import com.techreturners.BubbleTeaOrderService.BubbleTeaRouletteService;
import com.techreturners.BubbleTeaOrderService.BubbleTeaTypeEnum;
import com.techreturners.BubbleTeaOrderService.tests.testHelpers.RandomStub;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BubbleTeaRouletteServiceShould {

    @Test
    public void generate_a_random_bubble_tea_type_when_getRandomBubbleTeaType_is_called() {

        //Arrange
        RandomStub randomStub = new RandomStub(1);
        BubbleTeaRouletteService bubbleTeaRouletteService = new BubbleTeaRouletteService(randomStub);

        //Act
        var actualResult = bubbleTeaRouletteService.getRandomBubbleTeaType();
        var expectedResult = BubbleTeaTypeEnum.JasmineMilkTea;

        //Assert
        assertEquals(expectedResult, actualResult);

    }
}