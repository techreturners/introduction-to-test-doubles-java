package com.techreturners.BubbleTeaOrderService.tests.testHelpers;

import java.util.Random;

//This is a RandomStub
//Represents the Test Double type Stub

public class RandomStub extends Random {

    private int value;

    public RandomStub(int value) {
        this.value = value;
    }

    //has same method signature as Random.nextInt to provide a RandomStub.nextInt implementation
    public int nextInt(int value) {
        return this.value;
    }

}
