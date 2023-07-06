package ss1.exercise;

import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cân nặng của bạn: ");
        int number = scanner.nextInt();
        if (number < 0 || number > 999) {
            System.out.printf("Cân nặng không chính xác");
        } else if (number == 0) {
            System.out.println("zero");
        } else if (number < 10) {
            System.out.println(underTen(number));
        } else if (number < 20) {
            System.out.println(underTwenty(number));
        } else if (number < 100) {
            if (number % 10 == 0) {
                System.out.println(roundNumber(number));
            } else {
                System.out.println(roundNumber(number) + " " + underTen(number % 10));
            }
        } else {
            System.out.println(underTen(number / 100) + " hundred " + roundNumber(number % 100) + " " + underTen(number % 10));
        }
    }

    public static String underTen(int number) { //như 1 function, 1-9
        String numberStr = "";
        switch (number) {
            case 1:
                numberStr = "one";
                break;
            case 2:
                numberStr = "two";
                break;
            case 3:
                numberStr = "three";
                break;
            case 4:
                numberStr = "four";
                break;
            case 5:
                numberStr = "five";
                break;
            case 6:
                numberStr = "six";
                break;
            case 7:
                numberStr = "seven";
                break;
            case 8:
                numberStr = "eight";
                break;
            case 9:
                numberStr = "nine";
                break;
        }
        return numberStr;
    }

    public static String underTwenty(int number) {// 11-19
        String numberStr1 = "";
        switch (number % 10) {
            case 0:
                numberStr1 = "ten";
                break;
            case 1:
                numberStr1 = "eleven";
                break;
            case 2:
                numberStr1 = "twelve";
                break;
            case 3:
                numberStr1 = "thirteen";
                break;
            case 4:
                numberStr1 = "fourteen";
                break;
            case 5:
                numberStr1 = "fifteen";
                break;
            case 6:
                numberStr1 = "sixteen";
                break;
            case 7:
                numberStr1 = "seventeen";
                break;
            case 8:
                numberStr1 = "eighteen";
                break;
            case 9:
                numberStr1 = "nineteen";
                break;
        }
        return numberStr1;
    }

    public static String roundNumber(int number) {//tròn chục
        String numberStr2 = "";
        switch (number / 10) {
            case 2:
                numberStr2 = "twenty";
                break;
            case 3:
                numberStr2 = "thirty";
                break;
            case 4:
                numberStr2 = "fourty";
                break;
            case 5:
                numberStr2 = "fifty";
                break;
            case 6:
                numberStr2 = "sixty";
                break;
            case 7:
                numberStr2 = "seventy";
                break;
            case 8:
                numberStr2 = "eighty";
                break;
            case 9:
                numberStr2 = "ninety";
                break;
        }
        return numberStr2;
    }
}
