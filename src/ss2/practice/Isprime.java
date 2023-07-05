package ss2.practice;

import java.util.Scanner;

public class Isprime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra");
        int number;
        do {
            number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("Nhập lại số lớn hơn 0");
                break;
            }
        } while (number <= 0);
        boolean flag = true;
        if (number < 2) {
            System.out.println("Không phải SNT");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                    System.out.println("Không phải SNT");
                    break;
                }
            }
            if (flag) {
                System.out.println("Đây là SNT");
            }
        }
    }
}
