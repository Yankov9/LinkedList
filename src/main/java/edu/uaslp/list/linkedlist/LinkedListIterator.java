package edu.uaslp.list.linkedlist;

import edu.uaslp.list.Iterator;

public class LinkedListIterator<T> implements Iterator<T> {

    private Node<T> currentNode;

    LinkedListIterator(Node<T> head) {
        currentNode = head;
    }

    @Override
    public T next() {
        T data = currentNode.data;

        currentNode = currentNode.next;

        return data;
    }

    @Override
    public boolean hasNext() {
        return currentNode != null;
    }
}
