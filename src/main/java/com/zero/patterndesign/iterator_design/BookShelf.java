package com.zero.patterndesign.iterator_design;

import java.util.ArrayList;

/**
 * @Description
 * @Author ztqup666
 * @Since 2019/10/27 14:21
 */
public class BookShelf implements Aggregate {
    private ArrayList<Book> books;

    public BookShelf(int initialSize) {
        this.books = new ArrayList<Book>(initialSize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookSelfIterator(this);
    }


}
