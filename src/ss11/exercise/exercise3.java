package ss11.exercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra");
        String input = scanner.nextLine();
        input = input.toLowerCase();
        Stack<Character> myStack = new Stack<>();
        Queue<Character> myQueue = new LinkedList<>();
        boolean flag = true;
        for (int i = 0; i < input.length(); i++) {
            myStack.push(input.charAt(i));
            myQueue.add(input.charAt(i));
        }
        for (int i = 0; i < input.length(); i++) {
            if (myStack.pop() != myQueue.remove()) {
                flag = false;
                System.out.println("Đây không phải chuỗi Palindrome");
                break;
            }
        }
        if (flag) {
            System.out.println("Đây là chuỗi Palindrome");
        }
    }
}
