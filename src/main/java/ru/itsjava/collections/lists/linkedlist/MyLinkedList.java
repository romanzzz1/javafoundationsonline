package ru.itsjava.collections.lists.linkedlist;

public class MyLinkedList {

    private Node head;
    private int realSize;

    public int size() {
        Node bakaNode = head;
            while (bakaNode.getNext() != null) {
                realSize++;
            }
        return realSize;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contains(Object o) {
        Node curNode = head;
        while (curNode.getNext() != null) {
            if (curNode.getValue().equals(o)) {
                return true;
            } else {
                curNode = curNode.getNext();
            }
        }
        return false;
    }

    public boolean add(Object o) {
        Node resNode = new Node(o, null);
        if (head == null) {
            head = resNode;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(resNode);
        }
            return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {

    }

    public Object get(int i) {
        return null;
    }

    public Object set(int i, Object o) {
        return null;
    }

    public void add(int i, Object o) {

    }

    public Object remove(int i) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" + " head= " + head;
    }
}
