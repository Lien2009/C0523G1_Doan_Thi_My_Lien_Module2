package ss3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chèn");
        int x = scanner.nextInt();
        System.out.println("Nhập vị trí muốn chèn");
        int location = scanner.nextInt();
        int index = location - 1;
        int newArray[] = new int[array.length + 1];
        if (index < 0 || index > array.length - 1) {
            System.out.println("Không chèn được");
        } else {
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = x;
            for (int i = index + 1; i < array.length + 1; i++) {
                newArray[i] = array[i - 1];
            }
            System.out.println(Arrays.toString(newArray));
        }
    }
}
