package ss13.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String string = scanner.nextLine();
        List<Character> myList = new ArrayList<>();
        List<Character> maxList = new ArrayList<>();
        for (int j = 0; j < string.length(); j++) {//list trung gian để chứa chuỗi tăng dần sau mỗi lần lặp
            myList.add(string.charAt(j));//bắt đầu bằng phần tử đầu tiên
            for (int i = j; i < string.length() - 1; i++) {
                if (string.charAt(i+1) > myList.get(myList.size()-1)) {//nếu phẩn tử tiếp theo trong string lớn hơn phần tử cuối cùng trong list
                    myList.add(string.charAt(i+1));
                }
            }
            if (myList.size() > maxList.size()) {//nếu dài hơn thì add vào max
                maxList.clear();
                maxList.addAll(myList);
            }
            myList.clear();
        }
        for(Character part:maxList){
            System.out.print(part);
        }
    }
}
