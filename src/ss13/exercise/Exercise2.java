package ss13.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//bước1
        List<Integer> myList = new ArrayList<>();
        System.out.println("Nhập độ dài mảng:");
        int size = scanner.nextInt();
        System.out.println("Nhập số vào mảng:");
        for (int i = 0; i < size; i++) {
            int number = scanner.nextInt();
            myList.add(number);
        }
        System.out.println("Mảng vừa tạo:" + myList);
        myList.sort(((o1, o2) -> o1 - o2));//bước 2
        System.out.println("Mảng được sx tăng dần: " + myList);
        System.out.println("Nhập số cần tìm vị trí:");
        int number = scanner.nextInt();
        System.out.println(binarySearch(myList, 0, myList.size()-1, number));
    }
    public static int binarySearch(List<Integer> list, int left, int right, int value){
        while(right>=left) {
            int mid = (left+right)/2;
            if(value < list.get(mid))
                right = mid - 1;
            else if (value == list.get(mid)) {
                return mid;
            }
            else
                left = mid + 1;
        }
        return -1;
    }
}
