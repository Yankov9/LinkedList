package edu.uaslp.list.linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public void add(int data) {
        Node node = new Node();

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

    public int get(int index) {
        int counter = 0;
        Node it = head;

        while (counter < index && it != null) {
            counter++;
            it = it.next;
        }

        return it == null ? 0 : it.data;
    }

    public void delete(int index) {
        Node currentNode = head;
        int currentIndex = 0;

        if (index < 0 || index >= size) {
            return;
        }
        if (index == 0) {
            head = head.next;
            head.previous = null;
        }

        if (index == size - 1) {
            tail = tail.previous;
            tail.next = null;
        }

        if (index > 0 && index < size - 1) {
            while (currentIndex < index) {
                currentNode = currentNode.next;
                currentIndex++;
            }
            currentNode.previous.next = currentNode.next;
            currentNode.next.previous = currentNode.previous;
        }
        size--;
    }

    public void insert(int data, int index) {
        Node newNode = new Node();
        Node currentNode = head;
        int currentIndex = 0;

        newNode.data = data;

            while (currentIndex < index) {
                currentNode = currentNode.next;
                currentIndex++;
            }
            newNode.previous = currentNode.previous;
            newNode.next = currentNode;
            currentNode.previous = newNode;
            if(newNode.previous != null){
                newNode.previous.next = newNode;
            }
            size++;
        }
    }
