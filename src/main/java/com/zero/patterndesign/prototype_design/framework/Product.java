package com.zero.patterndesign.prototype_design.framework;

/**
 * @Description
 * @Author ztqup666
 * @Since 2019/12/15 16:23
 */
public abstract class Product implements Cloneable {
    public abstract void use(String s);


    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
