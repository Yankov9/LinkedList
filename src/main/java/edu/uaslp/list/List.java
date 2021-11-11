package edu.uaslp.list;

public interface List <T> {

    void add(T data);

    int getSize();

    T getAt(int index) throws MyIndexOutOfBoundException;

    void delete(int index) throws MyIndexOutOfBoundException;

    void insert(T data, int index);

    Iterator<T> getIterator();
}
