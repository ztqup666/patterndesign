package com.zero.patterndesign.bridgedesign;

import java.util.Random;

/**
 * @Description
 * @Author ztqup666
 * @Since 2020/3/22 21:56
 */
public class RandomDisplay extends Display {
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        int randomTime = new Random().nextInt(times);
        for (int i = 0; i < randomTime; i++) {
            display();
        }
    }
}
