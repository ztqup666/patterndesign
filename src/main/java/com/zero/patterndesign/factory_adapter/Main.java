package com.zero.patterndesign.factory_adapter;

import com.zero.patterndesign.factory_adapter.framework.Factory;
import com.zero.patterndesign.factory_adapter.framework.Product;
import com.zero.patterndesign.factory_adapter.idcard.IDCardFactory;

/**
 * @Description
 * @Author ztqup666
 * @Since 2019/12/15 15:11
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product product = factory.create("zero","123");
        Product product2 = factory.create("zero","1233");
        product.use();
        product2.use();
    }
}
