package MyArrayList;

import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] value = new Object[5];
    private int size = 0;

    public void add(T obj) {
        rebalanced();
        value[size] = obj;
        size++;
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(value[i]);
        }
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        return (T) value[index];
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        for (int i = index; i < size - 1; i++) {
            value[i] = value[i + 1];
        }
        size--;
        value[size] = null;
    }

    public void clear() {
        value = new Object[10];
        size = 0;
    }

    private void rebalanced() {
        if (value.length == size) {
            value = Arrays.copyOf(value, value.length + 1);
        }
    }
}
