package com.zero.patterndesign.template_adapter;

/**
 * @Description
 * @Author ztqup666
 * @Since 2019/12/1 16:45
 */
public abstract class AbstractDispaly {
    protected abstract void open();
    public abstract void print();
    public abstract void close();
    public final void display(){
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

}
