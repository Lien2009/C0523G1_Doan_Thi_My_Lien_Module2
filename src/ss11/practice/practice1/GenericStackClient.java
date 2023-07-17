package ss11.practice.practice1;

import java.util.Arrays;

public class GenericStackClient {
    public static void main(String[] args) {
//        stackOfStrings();
        stackOfIntegers();
    }
    private static void stackOfStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("size of stack:"+ stack.size());
        System.out.println("pop elements from stack:");
        while (!stack.isEmpty()){
            System.out.printf(" %s",stack.pop());
        }
        System.out.println("size after pop:"+stack.size());
    }
    private static void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("size of stack:"+ stack.size());
        System.out.println("pop elements from stack:");
        while (!stack.isEmpty()){
            System.out.printf(" %s",stack.pop());
        }
        System.out.println("size after pop:"+stack.size());
    }
}
