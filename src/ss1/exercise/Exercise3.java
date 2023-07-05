package ss1.exercise;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cân nặng của bạn: ");
        int weight = scanner.nextInt();
        String weightStr = String.valueOf(weight);//chuyển các kiểu DL khác thành chuỗi
        char[] weightChar = weightStr.toCharArray();//chuyển chuỗi thành mảng
        if (weight < 0 || weight > 999) {
            System.out.printf("Cân nặng không chính xác");
        }
        System.out.println(weightStr);
        System.out.println(weightChar);
        String check = "0123456789";
        char[] checkChar = check.toCharArray();//tạo mảng
        System.out.println(checkChar.length);
        String[] text = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        System.out.println(text.length);
        if (weight == 10) { //TH ngoai lệ
            System.out.println("mười");
        }
        if (weightChar.length < 2){//TH 1 chữ số
            for(int i = 0; i < checkChar.length; i++){
                if (weightChar[0] == checkChar[i]){
                    System.out.print(text[i]);
                }
            }
        } else if (weightChar.length < 3) {// TH 3 chữ số
            if (weightChar[0] == 1){ //mười mấy
                for (int i = 0; i < weightChar.length; i++){
                    for (int j = 0; j < checkChar.length; j++) {
                        if (weightChar[i] == checkChar[j]){

                        }
                    }
                }
            }
        }
    }
}
