package com.zero.patterndesign.abstract_factory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * @Description
 * @Author ztqup666
 * @Since 2020/3/22 19:47
 */
public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        try {
            String fileName = title + ".html";
            Writer writer = new FileWriter(fileName);
            writer.write(this.makeHtml());
            writer.close();
            System.out.println(fileName + " done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHtml();
}
