package ss2.exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số Số nguyên tố muốn hiển thị");
        int number = scanner.nextInt();
        int count = 0;
        int n = 2;
        while (count < number) {
            boolean flag = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
