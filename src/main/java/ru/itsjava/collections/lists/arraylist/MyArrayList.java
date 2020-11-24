package ru.itsjava.collections.lists.arraylist;

public class MyArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private int realSize;
    private Object[] array;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        if (realSize == 0) return true;
        return false;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < realSize; i++) {
            if (array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public boolean add(Object o) {
        if (realSize == array.length) {
            Object[] resArray = new Object[array.length * 3 / 2 + 1];
            //Копирование массива в новый
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;
            //Вставка нашего элемента
        }
        array[realSize++] = o;
        return true;
    }


    public boolean remove(Object o) {
        int delIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(o)) {
                delIndex = i;
                break;
            }
        }

        if (array.length - 1 - delIndex >= 0) {
            System.arraycopy(array, delIndex + 1, array, delIndex, array.length - 1 - delIndex);
        }
        if (delIndex == -1) {
            return false;
        } else {
            realSize--;
            return true;
        }
    }


    public void clear() {
        realSize = 0;
        Object[] resArray = new Object[realSize];
        array = resArray;
    }

    public Object get(int i) {
        return null;
    }

    public Object set(int i, Object o) {
        return null;
    }

    public void add(int i, Object o) {

    }

    public Object remove(int index2) {
        checkIndex(index2);
        Object resElement = array[index2];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        realSize--;
        return resElement;
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
//        return "MyArrayList (" + Arrays.toString(array) + ")";
        StringBuilder stringBuilder = new StringBuilder("MyArrayList : ");
        for (int i = 0; i < realSize; i++) {
            stringBuilder.append(array[i]).append(" , ");
        }
        return stringBuilder.toString();


    }
}
