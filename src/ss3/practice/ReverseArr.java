package ss3.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do{
            System.out.println("Nhập độ dài mảng");
            number = scanner.nextInt();
            if (number > 20){
                System.out.println("Nhập lại độ dài mảng <= 20");
            }
        }while (number>20);
        int array[] = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1));
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa tạo là: " + Arrays.toString(array));//in thẳng ra array chỉ hiện ra địa chỉ ô nhớ; dùng hàm này để chuyển thành chuỗi mới in ra được hoặc dùng vòng lặp for in ra từng phần tử
        for (int i = 0; i < number/2; i++) {
            int temp = array[i];
            array[i] = array[number - 1 - i];
            array[number - 1 - i] = temp;
        }
        System.out.println("Mảng đảo ngược là: " + Arrays.toString(array));
    }
}
