package com.zero.patterndesign.bridgedesign;

/**
 * @Description
 * @Author ztqup666
 * @Since 2020/3/22 21:44
 */
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
