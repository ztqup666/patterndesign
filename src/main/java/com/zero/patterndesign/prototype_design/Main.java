package com.zero.patterndesign.prototype_design;

import com.zero.patterndesign.prototype_design.framework.Manager;
import com.zero.patterndesign.prototype_design.framework.Product;

/**
 * @Description
 * @Author ztqup666
 * @Since 2019/12/15 16:22
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Product underLinePen = new UnderLinePen('u');
        Product messageBox = new MessageBox('m');
        Product messageBox2 = new MessageBox('m');
        manager.register("strong message", underLinePen);
        manager.register("warning box", messageBox);
        manager.register("slash box", messageBox2);

        Product product = manager.create("strong message");
        product.use("zero");
    }

}
