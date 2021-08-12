package com.techreturners.BubbleTeaOrderService;

import java.util.Random;

public class BubbleTeaRouletteService {

    private final Random random;
    private final int size = BubbleTeaTypeEnum.values().length;

    public BubbleTeaRouletteService(Random random) {
        this.random = random;
    }

    public BubbleTeaTypeEnum getRandomBubbleTeaType() {
        return BubbleTeaTypeEnum.values()[random.nextInt(size)];
    }

}
