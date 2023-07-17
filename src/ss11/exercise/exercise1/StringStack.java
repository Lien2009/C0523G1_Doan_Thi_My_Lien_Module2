package ss11.exercise.exercise1;

import java.util.Stack;

public class StringStack {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();
        Stack<String> reverseStack = new Stack<>();
        myStack.push("toi");
        myStack.push("la");
        myStack.push("lien");
        System.out.println("Trước khi đảo ngược: " + myStack);
        for (int i = myStack.size(); i > 0; i--) {
            reverseStack.push(myStack.pop());//lien la toi
        }
        for (String elements : reverseStack) {
            myStack.push(elements);//
        }
        System.out.println("Sau khi đảo ngược:" + myStack);
    }
}
