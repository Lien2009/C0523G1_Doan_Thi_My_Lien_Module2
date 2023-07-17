package ss11.exercise.exercise1;

import java.util.Stack;

public class IntegerStack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        Stack<Integer> reverseStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println("Trước khi đảo ngược:");
        System.out.println(myStack);
        for (int i = myStack.size(); i > 0; i--) {
            int number = myStack.pop();
            reverseStack.push(number);
        }
        for (Integer element : reverseStack) {
            myStack.push(element);
        }
        System.out.println("Sau khi đảo ngược:");
        System.out.println(myStack);
    }
}
