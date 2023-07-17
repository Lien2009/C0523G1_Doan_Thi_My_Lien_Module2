package ss11.exercise;

import java.util.Scanner;
import java.util.Stack;

public class exercise4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biểu thức:");
        String input = scanner.nextLine();
        Stack<Character> myStack = new Stack<>();
        char leftSym = '(';
        char rightSym = ')';
        int countRightSym = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == leftSym) {
                myStack.push(input.charAt(i));
            }
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == rightSym) {
                if (myStack.empty()) {
                    System.out.println("False");
                    break;
                } else {
                    countRightSym++;
                }
            }
        }
        if (countRightSym == myStack.size()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
