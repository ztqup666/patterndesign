package com.zero.patterndesign.abstract_factory.factory;

/**
 * @Description
 * 1.易于增加新的具体的工厂，只需要实现抽象工厂中的各个抽象类即可
 * 2.难以增加新的产品，当本身已经实现的具体的工厂已经很多的时候，增加新的工厂则会需要修改所有已经实现的工厂类
 * @Author ztqup666
 * @Since 2020/3/22 19:51
 */
public abstract class Factory {
    public static Factory getFactory(String className) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}
