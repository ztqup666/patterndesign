package com.zero.patterndesign.iterator_design;

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

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
