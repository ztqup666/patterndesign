package com.zero.patterndesign.abstract_factory.factory;

/**
 * @Description
 * @Author ztqup666
 * @Since 2019/12/15 17:20
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHtml();
}
