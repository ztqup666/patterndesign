package com.zero.patterndesign.prototype_design;

import com.zero.patterndesign.prototype_design.framework.Product;

/**
 * @Description
 * @Author ztqup666
 * @Since 2019/12/15 16:23
 */
public class UnderLinePen extends Product {
    private char ulchar;

    public UnderLinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        System.out.println("s != " + s);
    }


}
