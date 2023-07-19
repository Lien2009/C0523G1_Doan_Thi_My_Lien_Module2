package ss12.exercise.exercise1_mvc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.toLowerCase();
        String[] inputArr = input.split(" ");
        Map<String, Integer> myMap = new HashMap<>();
        for (int i = 0; i < inputArr.length; i++) {
            if (!myMap.containsKey(inputArr[i])) {
                myMap.put(inputArr[i], 1);
            } else {
                int value = myMap.get(inputArr[i]) + 1;
                myMap.put(inputArr[i], value);
            }
        }
        System.out.println(myMap);
    }
}
