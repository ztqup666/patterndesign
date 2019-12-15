package com.zero.patterndesign.iteratordesign;

/**
 * @Description
 * @Author ztqup666
 * @Since 2019/10/27 14:32
 */
public class BookSelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public BookSelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
