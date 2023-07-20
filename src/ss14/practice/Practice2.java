package ss14.practice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] list = new int[size];
        System.out.println("Nhập "+ size+ " phần tử:");
        for (int i = 0; i < size; i++) {
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        for(int element:list){
            System.out.println(element);
        }
        bubbleSortByStep(list);
        System.out.println("Sau khi sx:");
        for(int element:list){
            System.out.println(element);
        }
    }
    public static void bubbleSortByStep(int[] list){
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length-i; j++) {
                if(list[j] > list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
}
