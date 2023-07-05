package ss2.exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        
        int number = 20;
        int count = 0;
        int n = 2;
        while (count < 20){
            boolean flag = true;
            for (int i = 2; i < n ; i++) {
                if (n%i==0){
                    flag = false;
                }
            }
            if (flag){
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
