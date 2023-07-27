package ss19.exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static final String REGEX_PHONE = "^[(](84)[)]-[(]0\\d{9}[)]$";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX_PHONE);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập sđt:");
        String phoneNumber = scanner.nextLine();
        Matcher matcher = pattern.matcher(phoneNumber);
        System.out.println(matcher.matches());
    }
}
