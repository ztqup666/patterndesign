package com.zero.patterndesign.bridgedesign;

/**
 * @Description
 * @Author ztqup666
 * @Since 2020/3/22 21:08
 */
public class Display {
    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void close() {
        impl.rawClose();
    }

    public void print() {
        impl.rawPrint();
    }

    public void open() {
        impl.rawOpen();
    }

    public final void display() {
        open();
        print();
        close();
    }


}
