package ss16.exercise.exercise1;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static final String SOURCE_FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\ss16\\exercise\\exercise1\\source";
    public static final String TARGET_FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\ss16\\exercise\\exercise1\\target";

    public static void main(String[] args) {
        String input = ReadAndWriteFile.readFile(SOURCE_FILE);
        System.out.println(input);
        int count = ReadAndWriteFile.countChar(input);
        ReadAndWriteFile.writeFile(TARGET_FILE, input, count);
    }
}
