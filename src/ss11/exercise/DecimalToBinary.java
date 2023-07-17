package ss11.exercise.exercise2;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> mystack = new Stack<>();
        String result = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hệ thập phân:");
        int number = Integer.parseInt(scanner.nextLine());
        int phanNguyen = number;
        int phanDu = 0;
        while (phanNguyen>0){
            phanDu = phanNguyen%2;
            phanNguyen /= 2;
            mystack.push(phanDu);
        }
        for (int i = mystack.size(); i > 0 ; i--) {
            result += mystack.pop();
        }
        System.out.println(result);
    }
}
