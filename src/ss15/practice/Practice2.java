package ss15.practice;

import java.util.Random;
import java.util.Scanner;

public class Practice2 {
    public static int[] createRandom(int[] arr){
        Random rd = new Random();//tạo đối tượng để gọi random
        System.out.println("Danh sách phần tử của mảng:");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);//phần tử random là số nguyên trong vòng 100
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[100];
        createRandom(arr1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chỉ số:");
        int x = scanner.nextInt();
        try {
            System.out.println(arr1[x]);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Chỉ số ngoài mảng");
        }
    }
}
