package ss3.exercise;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        String string = "maba  cdaf12";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ký tự cần kiểm tra");
        char character = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (character == string.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
