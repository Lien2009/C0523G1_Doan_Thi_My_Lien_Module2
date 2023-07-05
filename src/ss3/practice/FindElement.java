package ss3.practice;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        String array[] = {"Liên","Hạnh","Hậu","Hưng","Thiện","Long"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên cần tìm:");
        String name = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(name)){//= String
                flag = false;
                System.out.println("Vị trí sinh viên trong danh sách là: " + (i+1));
                break;
            }
        }
        if (flag){
            System.out.println("Không tìm thấy");
        }
    }


}
