package ss3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
       deleted();
    }
    public static void deleted(){
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa:");
        int x = scanner.nextInt();
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index = i;
            }
        }
        System.out.println(index);
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
            array[i + 1] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}
