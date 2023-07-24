package ss16.practice.practice2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<>();
        try{
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null){//đọc cho đến khi nào khác null
//                System.out.println(line);
                numbers.add(Integer.parseInt(line));
            }
            System.out.println(numbers);
            br.close();
        } catch (Exception e){
            System.out.println("Lỗi");
        }
        return numbers;
    }
    public void writeFile(String filePath, int max){
        try{
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Gía trị lớn nhất là: "+max);
            bufferedWriter.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }


}
