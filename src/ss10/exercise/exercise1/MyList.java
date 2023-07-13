package ss10.exercise.exercise1;

import java.util.Arrays;

public class MyList<E> {
    private int size;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[] = new Object[DEFAULT_CAPACITY];
    private Object elements1[] = new Object[size+1];

    public MyList() {
    }

    public MyList(int size) {
        this.size = size;
    }
    public void doubleSize(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public E get(int index){
        if(index >=size||index <0){
            throw new IndexOutOfBoundsException("Index: "+ index + ",Size "+ index);
        }
        return (E) elements[index];
    }
    public void add(int index, String element){
        if(size == elements.length){
            doubleSize();
        } else {
            elements[index] = element;
            size++;
        }
        System.out.println(Arrays.toString(elements));
    }
    public E remove(int index){
        if(index >=size||index <0){
            throw new IndexOutOfBoundsException("Index: "+ index + ",Size "+ index);
        }
        for (int i = index; i < size; i++) {
            elements[i] = elements[i+1];
        } return (E) elements;
    }
}
