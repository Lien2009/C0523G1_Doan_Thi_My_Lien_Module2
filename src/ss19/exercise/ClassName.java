package ss19.exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    public static final String REGEX_NAME = "^[CAP]\\d{4}[GHIK]$";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX_NAME);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên lớp:");
        String className = scanner.nextLine();
        Matcher matcher = pattern.matcher(className);
        System.out.println(matcher.matches());
    }
}
