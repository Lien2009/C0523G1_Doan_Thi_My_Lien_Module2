package ss3.exercise;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng");
        int row = scanner.nextInt();
        System.out.println("Nhập số cột");
        int col = scanner.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập phần tử hàng " + (i + 1) + " cột " + (j + 1));
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        int max = arr[0][0];
        int indexR = 0;
        int indexC = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    indexR = i+1;
                    indexC = j+1;
                }
            }
        }
        System.out.println("Phần tử lớn nhất nằm ở hàng "+ indexR + " cột "+ indexC);
    }
}
