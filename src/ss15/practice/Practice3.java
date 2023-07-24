package ss15.practice;

import java.util.Scanner;

public class Practice3 {
    private static void calculate(double x, double y){
        try{
            double a= x+y;
            double b= x-y;
            double c= x*y;
            double d= x/y;
            System.out.println(a + ", "+b + ", "+c + ", "+d);
        }catch (Exception e){
            System.out.println("Xảy ra ngoại lệ: "+ e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 2 số:");
        double x = scanner.nextInt();
        double y = scanner.nextInt();
        calculate(x,y);
    }
}
