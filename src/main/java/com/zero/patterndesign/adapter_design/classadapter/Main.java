package com.zero.patterndesign.adapter_design.classadapter;

/**
 * @Description
 * @Author ztqup666
 * @Since 2019/12/1 15:05
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printStrong();
        p.printWeak();
    }
}
