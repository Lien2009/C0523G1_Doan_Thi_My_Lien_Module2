package ss16.exercise.exercise1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void writeFile(String pathFile, String line, int count) {
        try {
            FileWriter fileWriter = new FileWriter(pathFile);
            BufferedWriter br = new BufferedWriter(fileWriter);
            br.write(line);
            br.newLine();//tự động xuống dòng
            br.write("Tổng số ký tự: "+ count);
            br.close();//lưu và đóng file
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String readFile(String pathFile) {
        String list = "";
        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                list += line+"\n";
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public static int countChar(String string){
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) != ' '){
                count++;
            }
        } return count;
    }
}
