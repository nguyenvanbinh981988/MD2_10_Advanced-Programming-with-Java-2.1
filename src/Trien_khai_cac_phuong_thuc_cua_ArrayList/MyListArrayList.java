package Trien_khai_cac_phuong_thuc_cua_ArrayList;

import java.lang.Object;
import java.util.Arrays;

public class MyListArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyListArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapa() {
        int newSize = size * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public MyListArrayList(int capacity) {
        elements = new Object[capacity];
    }

    public int size() {
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            while (elements[i] != null) {
                count++;
                break;
            }
        }
        return count;
    }

    public void add(int index, E e) {
        if (index > 0 || index <= size()) {
            Object[] newElement = new Object[elements.length + 1];
            for (int i = 0; i < index; i++) {
                newElement[i] = elements[i];
            }
            newElement[index] = e;
            for (int i = index + 1; i < elements.length; i++) {
                newElement[i] = elements[i - 1];
            }
            elements = newElement;
        }
    }

    public E remove(int index) {
        Object[] newElement = new Object[elements.length - 1];
        for (int i = 0; i < index; i++) {
            newElement[i] = elements[i];
        }
        for (int i = index; i < elements.length - 1; i++) {
            newElement[i] = elements[i + 1];
        }
        elements = newElement;
        return (E) elements;
    }


    public E clone() {
        Object[] newElement1 = new Object[elements.length];
        for (int i = 0; i < elements.length; i++) {
            newElement1[i] = elements[i];
        }
        return (E) newElement1;
    }

    public boolean contains(E o) {
        boolean check = false;
        for (int i = 0; i < elements.length; i++) {
            if (o.equals(elements[i])) {
                check = true;
                break;
            }
        }
        return check;
    }

    public int indexOf(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public void ensureCapacity(int minCapacity) {
        Object[] newElement = new Object[minCapacity];
        if (newElement.length<elements.length) {
            for (int i = 0; i < newElement.length; i++) {
                newElement[i] = elements[i];
            }
        }else {
            for (int i = 0; i < elements.length; i++) {
                newElement[i] = elements[i];
            }
        }
        elements = newElement;
    }

    public E get(int i) {
        if (i>=elements.length || i<0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];

    }

    public void clear(){
        Object[] newElement = new Object[DEFAULT_CAPACITY];
        elements = newElement;

    }

}
