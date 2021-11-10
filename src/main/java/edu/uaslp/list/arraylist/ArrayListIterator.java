package edu.uaslp.list.arraylist;

import edu.uaslp.list.Iterator;

public class ArrayListIterator <T> implements Iterator<T> {

    private int currentIndex = 0;
    private final Arraylist<T> arraylist;

    ArrayListIterator(Arraylist<T> arraylist){
        this.arraylist = arraylist;
    }

    @Override
    public T next() {
        return arraylist.getAt(currentIndex++);
    }

    @Override
    public boolean hasNext() {
        return currentIndex < arraylist.getSize();
    }
}
