package ss14.exercise;

public class InsertionSort {
    public static void insertSort(int[] list) {//nếu sx giảm dần thì cài đặt < temp
        for (int i = 1; i < list.length; i++) {//chạy từ 1 vì vị tri đầu tiên ko có số nào tec đó để so sánh
            System.out.println("Lấy " + list[i] + " ra chèn:");
            int temp = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > temp) {//dịch chuyển sang phải nếu lớn hơn temp
                System.out.println("Dịch phần tử từ " + j + "->" + (j + 1) + " vì " + list[j] + " lớn hơn " + temp);
                list[j + 1] = list[j];
                j--;
            }
            System.out.println("Chèn " + temp + " vào vị trí " + (j + 1));
            list[j + 1] = temp;//hết số lớn hơn temp, sẽ có chỗ trống tại j+1 vì đã dịch sang phải hết
        }
    }

    public static void main(String[] args) {
        int[] mylist = {0, 3, -4, 2};
        insertSort(mylist);
        for (int element : mylist) {
            System.out.println(element);
        }
    }
}
