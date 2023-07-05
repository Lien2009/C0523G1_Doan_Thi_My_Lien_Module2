package ss2.exercise;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu\n" +
                    "1.In hình chữ nhật \n" +
                    "2.In hình tam giác vuông(top-left)\n" +
                    "3.In hình tam giác vuông(top-right)\n" +
                    "4.In hình tam giác vuông(botton-left)\n" +
                    "5.In hình tam giác vuông(botton-right)\n" +
                    "6.In hình tam giác cân\n" +
                    "0.Exit");
            System.out.println("Nhập STT hình vẽ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (j>=i) {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (j>=i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (i >= j) {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (i+j >= 5-1){
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    } break;
                case 6:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5 * 2 - 1; j++) {
                            if (5 - j > i + 1 || j - 5 > i - 1) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }
        }
    }
}
