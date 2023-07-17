package ss11.exercise;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> mystack = new Stack<>();
        String ketQua = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hệ thập phân:");
        int so = Integer.parseInt(scanner.nextLine());
        int phanNguyen = so;
        int phanDu = 0;
        while (phanNguyen>0){
            phanDu = phanNguyen%2;
            phanNguyen /= 2;
            mystack.push(phanDu);
        }
        for (int i = mystack.size(); i > 0 ; i--) {
            ketQua += mystack.pop();
        }
        System.out.println(ketQua);
    }
}
