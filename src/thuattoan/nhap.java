package thuattoan;

import java.util.Scanner;

public class nhap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài nửa đường chéo hình thoi");
        int number = scanner.nextInt();
        for (int i = 0; i < number * 2 - 1; i++) {
            for (int j = 0; j < number * 2; j++) {
                if (number - j == i + 1 || j - number == i || i - number == j - 1 || i + j == 3 * number - 2) {
                    if (i < number) {
                        System.out.print(i + 1);
                    } else {
                        System.out.print((number * 2 - 1) - i);
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
