package ss16.practice.practice2;

import java.util.List;

import static ss16.practice.practice2.ReadAndWriteFile.findMax;

public class FindMaxValue {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\ss16\\practice\\practice2\\number");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\ss16\\practice\\practice2\\result", maxValue);
    }
}
