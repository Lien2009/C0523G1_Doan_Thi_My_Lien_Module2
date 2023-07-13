package ss10.practice.practice1;

import java.util.Arrays;

public class MyList<E> {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY ];
    }
    private void ensureCapa(){//tạp mảng kích thước gấp đôi
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add(E e){//nếu mảng đứa đủ phần tử, trc khi thêm caanf nhân đôi mảng
        if(size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }
    public E get(int i){
        if(i>=size||i<0){
            throw new IndexOutOfBoundsException("Index: "+ i + ",Size "+ i);
        }
        return (E) elements[i];
    }
}
