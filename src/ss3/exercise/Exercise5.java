package ss3.exercise;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng:");
        int number = scanner.nextInt();
        int arr[] = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1));
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < number; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Gía trị nhỏ nhất là: " + min);
    }
}
