package com.zero.patterndesign.adapter_design.classadapter;

/**
 * @Description 适配器角色
 * @Author ztqup666
 * @Since 2019/12/1 15:05
 */
public class PrintBanner extends Banner implements Print{
    public PrintBanner(String s) {
        super(s);
    }

    public void printWeak() {
        showWithParen();
    }

    public void printStrong() {
        showWithAster();
    }
}
