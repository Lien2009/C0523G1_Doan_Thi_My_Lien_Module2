package ss3.exercise;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số hàng");
        int row = scanner.nextInt();
        System.out.println("Số cột");
        int col = scanner.nextInt();
        double arr[][] = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập phần tử hàng " + i + " cột " + j);
                arr[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Nhập vào thứ tự cột muốn tính tổng phần tử:");
        int choose = scanner.nextInt();
        double sum = 0.0;
        for (int i = 0; i < row; i++) {
            sum += arr[i][choose];
        }
        System.out.println("Kết quả: " + sum);
    }
}
