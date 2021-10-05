package edu.uaslp.list.linkedlist;

public class LinkedList <T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void add(T data) {
        Node<T> node = new Node<>();

        node.data = data;

        if (head == null) {
            head = node;
        }
        node.previous = tail;
        if (tail != null) {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    public int getSize() {
        return size;
    }

    public T getAt(int index) {
        int counter = 0;
        Node<T> it = head;

        while (counter < index && it != null) {
            counter++;
            it = it.next;
        }

        return it == null ? null : it.data;
    }

    public void delete(int index) {
        Node<T> currentNode = head;
        int currentIndex = 0;

        if (index < 0 || index >= size) {
            return;
        }

        while (currentIndex < index && currentNode != null) {
            currentNode = currentNode.next;
            currentIndex++;
        }

        if (currentNode.previous == null) {
            head = currentNode.next;
        } else {
            currentNode.previous.next = currentNode.next;
        }

        if (currentNode.next == null) {
            tail = currentNode.previous;
        } else {
            currentNode.next.previous = currentNode.previous;
        }
        size--;
    }

    public void insert(T data, int index) {
        Node<T> currentNode = head;
        int currentIndex = 0;

        if (index < 0 || index >= size) {
            return;
        }

        if(index == size){
            add(data);
            return;
        }
        while (currentIndex < index && currentNode != null) {
            currentNode = currentNode.next;
            currentIndex++;
        }

        Node<T> node = new Node<>();

        node.data = data;
        node.next = currentNode;
        node.previous = currentNode.previous;

        if(currentNode.previous == null){
            head = node;
        }else{
            currentNode.previous.next = node;
        }
        currentNode.previous = node;
    }

    public void print(){
        Node<T> iterator = head;

        while(iterator != null){
            System.out.println(iterator.data);
            iterator = iterator.next;
        }
    }
}
