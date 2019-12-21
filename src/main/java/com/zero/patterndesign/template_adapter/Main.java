package com.zero.patterndesign.template_adapter;

/**
 * @Description
 * @Author ztqup666
 * @Since 2019/10/27 14:39
 *
 *
 * @see AbstractDispaly#open()
 */
public class Main {
    public static void main(String[] args) {
        CharDisplay charDisplay = new CharDisplay('c');
        charDisplay.display();
    }
}
