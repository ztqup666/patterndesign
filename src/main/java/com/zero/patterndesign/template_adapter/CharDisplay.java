package com.zero.patterndesign.template_adapter;

/**
 * @Description
 * @Author ztqup666
 * @Since 2019/12/15 13:25
 */
public class CharDisplay extends AbstractDispaly {
    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    protected void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
