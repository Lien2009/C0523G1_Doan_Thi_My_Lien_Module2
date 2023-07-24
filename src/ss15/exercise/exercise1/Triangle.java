package ss15.exercise.exercise1;

import java.util.Scanner;

public class Triangle {
    private static void illegalTriangleException(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Cạnh lớn hơn 0");
        }
        if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException("Tổng 2 cạnh lớn hơn cạnh còn lại");
        }
    }

    public static void main(String[] args) {
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập vào cạnh a:");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập vào cạnh b:");
                int b = scanner.nextInt();
                System.out.println("Nhập vào cạnh c:");
                int c = scanner.nextInt();
                illegalTriangleException(a, b, c);//nếu bắt thì rơi xún catch và lặp lại, ko thể rơi xún ok
                System.out.println("OK");
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("sai roi");
            }
        } while (true);
    }
}
