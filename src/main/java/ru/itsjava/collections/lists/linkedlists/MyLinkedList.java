package ru.itsjava.collections.lists.linkedlists;

public class MyLinkedList {

    private Node head;
    private int realSize = 0;

    public int size() {
        Node curNode = head;
        while (curNode != null) {
            curNode = curNode.getNext();
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
        while (curNode != null) {
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
        Node curNode = head;
        while (head != null) {
            head = head.getNext();
            curNode = null;
        }
    }

    public Object get(int index) {
        checkIndex(index);
        Object resValue;
        while (index != 0) {
            head = head.getNext();
            index--;
        }
        resValue = head.getValue();
        return resValue;
    }

    public Object set(int index, Object element) {
        checkIndex(index);
        Node curNode = head;


        if (head.getNext() == null) {
            Object curValue = head.getValue();
        }

        while (index != 0) {
            curNode = curNode.getNext();
            index--;
        }
        Object curValue = head.getValue();
        return curValue;
    }

    public void add(int i, Object o) {

    }

    public Object remove(int index) {
        checkIndex(index);
        if (index == 0) {
            Object resValue = head.getValue();
            if (head.getNext() == null) {
                head = null;
            } else {
                head = head.getNext();
            }
            return resValue;
        }
        Node curNode = head;
        Node prevNode = head;
        int count = 0;
        while ((curNode = curNode.getNext()) != null) {
            count++;
            if (count == index) {
                break;
            }
            prevNode = prevNode.getNext();
        }
        Object resValue = curNode.getValue();
        if (curNode.getNext() == null) {
            curNode.setNext(null);
        } else {
            prevNode.setNext(curNode.getNext());
            curNode.setNext(null);
        }
        return resValue;
    }

    private void checkIndex(int index1) {
        if (!isCorrectIndex(index1)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс!");
        }
    }

    private boolean isCorrectIndex(int index) {
        if (index > -1 && index < realSize) {
            return true;
        } else {
            return false;
        }
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
