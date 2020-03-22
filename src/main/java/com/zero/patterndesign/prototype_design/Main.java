package com.zero.patterndesign.prototype_design;

import com.zero.patterndesign.prototype_design.framework.Manager;
import com.zero.patterndesign.prototype_design.framework.Product;

/**
 * @Description 使用原型模式（使用实例来生成实例）的场景：
 * 1.对象种类繁多，无法将他们整合到一个类中时。
 * 2.难以根据类来生成实例。（比如我们想生成一个和用户通过一系列鼠标操作所创建出来的实例完全一样的实例）
 * 3.解耦框架与生成的实例（如例子中没有直接使用类名来生成，而是通过字符串来生成实例，将框架从类名的舒服解脱出来）
 *
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
