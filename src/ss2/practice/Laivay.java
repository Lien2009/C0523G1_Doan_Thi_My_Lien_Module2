package ss2.practice;

import java.util.Scanner;

public class Laivay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi");
        double money = scanner.nextDouble();
        System.out.println("Nhập kỳ hạn(tháng)");
        int month = scanner.nextInt();
        System.out.println("Nhập lãi suất");
        double interest = scanner.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interest/100)/12 * month;
        }
        System.out.println("Tiền lãi nhận được là: " + totalInterest);
    }
}
