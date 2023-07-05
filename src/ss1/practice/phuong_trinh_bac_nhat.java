package ss1.practice;

import java.util.Scanner;

public class phuong_trinh_bac_nhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner scanner = new Scanner(System.in); //bắt đầu nhập
        System.out.print("a: ");//nhập từng phần tử
        double a = scanner.nextDouble();
        System.out.print("b: ");//nhập từng phần tử
        double b = scanner.nextDouble();
        System.out.print("c: ");//nhập từng phần tử
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
