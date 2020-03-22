package com.zero.patterndesign.abstract_factory.factory;

import lombok.experimental.Accessors;

import java.util.ArrayList;

/**
 * @Description
 * @Author ztqup666
 * @Since 2020/3/22 19:45
 */
public abstract class Tray extends Item {

    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
