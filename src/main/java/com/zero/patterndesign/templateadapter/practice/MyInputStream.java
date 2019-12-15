package com.zero.patterndesign.templateadapter.practice;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description
 * @Author ztqup666
 * @Since 2019/12/15 14:03
 */
public class MyInputStream extends InputStream {

    @Override
    public int read() throws IOException {
        return read0();
    }

    private native int read0() throws IOException;

}
