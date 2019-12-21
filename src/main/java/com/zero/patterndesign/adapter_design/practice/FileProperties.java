package com.zero.patterndesign.adapter_design.practice;

import java.io.*;
import java.util.Properties;

/**
 * @Description
 * @Author ztqup666
 * @Since 2019/12/1 16:08
 */
public class FileProperties implements FileIO{
    private Properties properties = new Properties();

    public void readFromFile(String filename) throws IOException {
        InputStream inputStream = new FileInputStream(filename);
        properties.load(inputStream);
        inputStream.close();
    }

    public void writeFromFile(String filename) throws IOException {
        OutputStream outputStream = new FileOutputStream(filename);
        properties.store(outputStream,"");
        outputStream.close();
    }

    public void setValue(String key, String value) {
        properties.setProperty(key,value);
    }

    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
