package com.zero.patterndesign.templateadapter;

import com.zero.patterndesign.iteratordesign.Book;
import com.zero.patterndesign.iteratordesign.BookShelf;
import com.zero.patterndesign.iteratordesign.Iterator;

import java.io.InputStream;

/**
 * @Description
 * @Author ztqup666
 * @Since 2019/10/27 14:39
 *
 *
 * @see AbstractDispaly#open()
 */
public class Main {
    public static void main(String[] args) {
        CharDisplay charDisplay = new CharDisplay('c');
        charDisplay.display();
    }
}
