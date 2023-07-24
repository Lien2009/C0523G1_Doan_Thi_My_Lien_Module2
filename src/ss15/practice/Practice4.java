package ss15.practice;

import java.util.Scanner;

public class Practice4 {
    public static void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 2 số");
        try {
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            int result = a/b;
            System.out.println(result);
        }catch (NumberFormatException e){
            System.out.println("Nhập dạng chữ");
        }catch (Exception e){
            System.out.println("Lỗi");
        }finally {
            System.out.println("End");
        }
//        System.exit(0);//đặt ở đâu dừng ở đó
        System.out.println("Chạy đến đây không?");
    }

    public static void main(String[] args) {
        input();
    }
}
//nhập đúng: chạy hết try, finally, sau khối lệnh catch/finally
//nhập sai: ko chạy sau lệnh lỗi trong try, catch, finally, sau khối lệnh catch/finally
