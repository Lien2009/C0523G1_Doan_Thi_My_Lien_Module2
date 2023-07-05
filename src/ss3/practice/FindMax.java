package ss3.practice;

import java.util.Arrays;
import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Nhập số tỷ phú");
            number = scanner.nextInt();
        } while (number > 20);
        int array[] = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Nhập tài sản của tỷ phú thứ " + (i + 1));
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa tạo: " + Arrays.toString(array));
        int max = array[0];
        int index = 0;
        for (int j = 1; j < number; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Gía trị tài sản lớn nhất là: " + max + " ở vị trí thứ " + index);
    }
}