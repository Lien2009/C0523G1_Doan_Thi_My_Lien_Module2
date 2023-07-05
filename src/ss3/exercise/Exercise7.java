package ss3.exercise;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước ma trận:");
        int number = scanner.nextInt();
        double arr[][] = new double[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.println("Nhập phần tử hàng " + i + " cột " + j);
                arr[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        double sum = 0.0;
        for (int i = 0; i < number; i++) {
            sum += arr[i][i];
        }
        System.out.println("Kết quả: " + sum);
    }
}
