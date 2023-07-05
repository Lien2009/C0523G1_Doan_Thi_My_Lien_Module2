package ss1.exercise;

import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cân nặng của bạn: ");
        int weight = scanner.nextInt();
        if (weight < 0 || weight > 999) {
            System.out.printf("Cân nặng không chính xác");
        } else if (weight == 0) {
            System.out.println("zero");
        } else if (weight < 10) {
            System.out.println(so1_9(weight));
        } else if (weight < 20) {
            System.out.println(so10_19(weight));
        } else if (weight < 100) {
            if (weight % 10 == 0) {
                System.out.println(tronChuc(weight));
            } else {
                System.out.println(tronChuc(weight) + " " + so1_9(weight % 10));
            }
        } else {
            System.out.println(so1_9(weight / 100) + " hundred " + tronChuc(weight % 100) + " " + so1_9(weight % 10));
        }
    }

    public static String so1_9(int weight) { //như 1 function
        String weightStr = "";
        switch (weight) {
            case 1:
                weightStr = "one";
                break;
            case 2:
                weightStr = "two";
                break;
            case 3:
                weightStr = "three";
                break;
            case 4:
                weightStr = "four";
                break;
            case 5:
                weightStr = "five";
                break;
            case 6:
                weightStr = "six";
                break;
            case 7:
                weightStr = "seven";
                break;
            case 8:
                weightStr = "eight";
                break;
            case 9:
                weightStr = "nine";
                break;
        }
        return weightStr;
    }

    public static String so10_19(int weight) {
        String weightStr1 = "";
        switch (weight % 10) {
            case 0:
                weightStr1 = "ten";
                break;
            case 1:
                weightStr1 = "eleven";
                break;
            case 2:
                weightStr1 = "twelve";
                break;
            case 3:
                weightStr1 = "thirteen";
                break;
            case 4:
                weightStr1 = "fourteen";
                break;
            case 5:
                weightStr1 = "fifteen";
                break;
            case 6:
                weightStr1 = "sixteen";
                break;
            case 7:
                weightStr1 = "seventeen";
                break;
            case 8:
                weightStr1 = "eighteen";
                break;
            case 9:
                weightStr1 = "nineteen";
                break;
        }
        return weightStr1;
    }

    public static String tronChuc(int weight) {
        String weightStr2 = "";
        switch (weight / 10) {
            case 2:
                weightStr2 = "twenty";
                break;
            case 3:
                weightStr2 = "thirty";
                break;
            case 4:
                weightStr2 = "fourty";
                break;
            case 5:
                weightStr2 = "fifty";
                break;
            case 6:
                weightStr2 = "sixty";
                break;
            case 7:
                weightStr2 = "seventy";
                break;
            case 8:
                weightStr2 = "eighty";
                break;
            case 9:
                weightStr2 = "ninety";
                break;
        }
        return weightStr2;
    }
}
