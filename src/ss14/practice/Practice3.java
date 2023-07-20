package ss14.practice;

public class Practice3 {
    public static void main(String[] args) {
        int[] list = {1, 4, -2, 0, 14, 5, 20, 1};
        selectionSort(list);
        for (int element : list) {
            System.out.println(element);
        }
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {//số cuối cùng mặc nhiên ko cần xếp chỗ nữa
            int min;
            for (int j = i + 1; j < list.length; j++) {//tìm min cho từng vị trí lần lượt từ đầu đến cuối
                min = list[i];
                if (min > list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}
