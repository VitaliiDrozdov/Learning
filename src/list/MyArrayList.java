package list;

import java.util.Arrays;

public class MyArrayList {

    private Object[] objects;

    private int currentSize = 0;

    public MyArrayList() {
        objects = new Object[10];
    }

    public MyArrayList(int size) {
        objects = new Object[size];
    }

    public void add(Object o) {
        if (currentSize == objects.length) {
            Object[] newArray = Arrays.copyOf(this.objects, (this.objects.length * 2 + 1));
            this.objects = newArray;
        }
        this.objects[currentSize++] = o;
    }

    public boolean remove(Object o) {
        boolean removed = false;
        for (int i = 0; i < currentSize; i++) {
            if (objects[i].equals(o)) {
                remove(i);
                removed = true;
            }
        }
        return removed;
    }

    public void remove(int index) {
        if (index >= currentSize || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        for (; index < currentSize - 1; index++) {
            objects[index] = objects[index + 1];
        }
        objects[index] = null;
        currentSize--;

    }

    public boolean isEmpty() {

        return currentSize == 0;
    }

    public Object get(int index) {
        if (index >= currentSize || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return this.objects[index];
    }

    public int size() {
        return currentSize;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < this.objects.length; i++) {
            System.out.print(" " + this.objects[i] + " ");
        }
        System.out.println("]");
    }

}
