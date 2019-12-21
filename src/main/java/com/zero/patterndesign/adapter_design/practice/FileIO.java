package com.zero.patterndesign.adapter_design.practice;

import java.io.IOException;

/**
 * @Description
 * @Author ztqup666
 * @Since 2019/12/1 16:08
 */
public interface FileIO {
    void readFromFile(String filename)throws IOException;
    void writeFromFile(String filename)throws IOException;
    void setValue(String key,String value);
    public String getValue(String key);
}
