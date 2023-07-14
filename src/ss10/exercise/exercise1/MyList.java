package ss10.exercise.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class MyList<E> {
    int size;
    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ELEMENT = {};
    private Object elements[] = new Object[DEFAULT_CAPACITY];

    public MyList() {
    }

    public MyList(int capicity) {
        if (capicity > 0) {
            elements = new Object[capicity];
        } else if (capicity == 0) {
            elements = EMPTY_ELEMENT;
        } else {
            throw new IllegalArgumentException("Capicity: " + capicity);//throw để ngừng luồng chạy của ctrinh
        }
    }

    public void ensureCapacity(int minCapacity) {//tăng kích thước list
        if (minCapacity >= 0) {
            int increaseSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, increaseSize);
            System.out.println("Kích thước mới:" + increaseSize);
        } else {
            throw new IllegalArgumentException("minCapacity" + minCapacity);
        }
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ",Size " + index);
        }
        return (E) elements[index];
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(1);
        }
        elements[size] = e;
        size++;
        return true;
    }

    public void add(int index, E element) {
        if (index > size) {
            throw new IllegalArgumentException("index" + index);
        } else {
            if (size == DEFAULT_CAPACITY) {
                ensureCapacity(1);
            }
            for (int i = elements.length - 1; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            size++;
            elements[index] = element;
        }
    }

    public E remove(int index) {
        if (index > size) {
            throw new IllegalArgumentException("index" + index);
        } else {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
        }
        return (E) elements;
    }

    public MyList<E> clone() {//tạo 1 bản sao
        MyList<E> c = new MyList<>();
        c.elements = Arrays.copyOf(elements, size);
        c.size = size;
        return c;
    }

    public int indexOf(E o) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (o == elements[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean contains(E o) {
        boolean flag = true;
        if (this.indexOf(o) == -1) {
            flag = false;
        }
        return flag;
    }

    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }
}
