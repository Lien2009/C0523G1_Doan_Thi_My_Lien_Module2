package ss14.exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void insertionSort(double[] list) {
        for (int i = 1; i < list.length; i++) {
            double temp = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > temp) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng:");
        int size = Integer.parseInt(scanner.nextLine());
        double[] myList = new double[size];
        System.out.println("Nhập " + size + " phần tử");
        for (int i = 0; i < size; i++) {
            myList[i] = scanner.nextDouble();
        }
        System.out.println("Mảng trước khi sx: ");
        for (double element : myList) {
            System.out.println(element);
        }
        insertionSort(myList);
        System.out.println("Mảng trước khi sx:");
        for (double element : myList) {
            System.out.println(element);
        }
    }
}
