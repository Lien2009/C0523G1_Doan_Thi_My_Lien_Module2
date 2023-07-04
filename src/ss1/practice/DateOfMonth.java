package ss1.practice;

import java.util.Scanner;

public class DateOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tháng cần tính ngày");
        int month = scanner.nextInt();
        switch (month){
            case 2:
                System.out.print("Tháng 2 có 28 hoặc 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("Tháng %d có %d ngày",month,31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("Tháng %d có %d ngày",month,30);
                break;
            default:
                System.out.println("Không có tháng này");
        }

    }
}
