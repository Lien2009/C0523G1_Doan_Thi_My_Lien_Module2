package ss3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr1[] = new int[3];
        int arr2[] = new int[2];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Tạo mảng 1: Nhập phần tử thứ " + (i + 1));
            arr1[i] = scanner.nextInt();
        }
        System.out.println("arr1: " + Arrays.toString(arr1));
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Tạo mảng 2: Nhập phần tử thứ " + (i + 1));
            arr2[i] = scanner.nextInt();
        }
        System.out.println("arr2: " + Arrays.toString(arr2));
        int arr3[] = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        System.out.println("Mảng gộp là: " + Arrays.toString(arr3));
    }
}
