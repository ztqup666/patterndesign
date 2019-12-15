package com.zero.patterndesign.adapterdesign.classadapter;

/**
 * @Description Adaptee 适配者类  https://blog.csdn.net/wwwdc1012/article/details/82780560
 * @Author ztqup666
 * @Since 2019/12/1 15:03
 */
public class Banner {
    private String s;

    public Banner(String s) {
        this.s = s;
    }

    public void showWithParen() {
        System.out.println("(" + s + ")");
    }

    public void showWithAster() {
        System.out.println("*" + s + "*");
    }
}
