package com.zero.patterndesign.iteratordesign;

/**
 * @Description 集合
 * @Author ztqup666
 * @Since 2019/10/27 14:15
 */
public interface Aggregate {
    /**
     * 返回集合的迭代器对象
     * @return Iterator
     */
    public abstract Iterator iterator();
}
