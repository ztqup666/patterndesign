package com.zero.patterndesign.abstract_factory.factory;

/**
 * @Description
 * @Author ztqup666
 * @Since 2020/3/22 19:42
 */
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
