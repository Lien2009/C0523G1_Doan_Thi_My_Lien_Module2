package ss4.exercise;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(){

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return (Math.pow(this.b, 2) - 4 * this.a * this.c);
    }

    public double getRoot1() {
        return ((-this.b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a));
    }

    public double getRoot2() {
        return ((-this.b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập b:");
        double b = scanner.nextDouble();
        System.out.println("Nhập c:");
        double c = scanner.nextDouble();
        QuadraticEquation math1 = new QuadraticEquation(a, b, c);
        System.out.println("Delta: " + math1.getDiscriminant());
        if (math1.getDiscriminant() > 0) {
            System.out.println("PT có 2 nghiệm: " + math1.getRoot1() + " và " + math1.getRoot2());
        } else if (math1.getDiscriminant() == 0) {
            System.out.println("PT có 1 nghiệm: " + math1.getRoot1());
        } else {
            System.out.println("PT vô nghiệm");
        }
    }
}
