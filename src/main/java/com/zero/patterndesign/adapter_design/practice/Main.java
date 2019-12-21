package com.zero.patterndesign.adapter_design.practice;

import java.io.IOException;

/**
 * @Description
 * @Author ztqup666
 * @Since 2019/12/1 16:11
 */
public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try{
            f.readFromFile("E:\\Code\\JavaDevlop\\patterndesign\\src\\main\\java\\com\\zero\\patterndesign\\adapterdesign\\practice\\file.txt");
            f.setValue("year","2019");
            f.setValue("month","12");
            f.setValue("month","12");
            f.setValue("day","1");
            f.writeFromFile("E:\\Code\\JavaDevlop\\patterndesign\\src\\main\\java\\com\\zero\\patterndesign\\adapterdesign\\practice\\newFile.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
