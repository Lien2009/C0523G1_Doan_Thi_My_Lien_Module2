package ss1.exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD");
        double money = scanner.nextDouble();
        double Vnd = money*23500;
        System.out.println("Quy ra tiền VND là: " + Vnd);
    }
}
