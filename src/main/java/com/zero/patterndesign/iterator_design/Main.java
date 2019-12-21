package com.zero.patterndesign.iterator_design;

/**
 * @Description
 * @Author ztqup666
 * @Since 2019/10/27 14:39
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("第一行代码"));
        bookShelf.appendBook(new Book("设计模式图解"));
        bookShelf.appendBook(new Book("java多线程编程"));
        bookShelf.appendBook(new Book("java多线程编程"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
