package com.zero.patterndesign.prototype_design.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author ztqup666
 * @Since 2019/12/15 16:23
 */
public class Manager {
    private Map showcase = new HashMap();

    public void register(String name, Product product) {
        showcase.put(name, product);
    }

    public Product create(String protoname) {
        Product product = (Product) showcase.get(protoname);
        return product.createClone();
    }
}
