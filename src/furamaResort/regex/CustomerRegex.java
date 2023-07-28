package furamaResort.regex;

import java.util.Scanner;

public class CustomerRegex {
    private static final String REGEX_ID = "^KH-[0-9]{4}$";
    static Scanner scanner = new Scanner(System.in);

    public static String checkId() {
        boolean checkId;
        String id;
        do {
            id = scanner.nextLine();
            checkId = id.matches(REGEX_ID);
            if (!checkId) {
                System.out.println("Enter Id again!");
            }
        } while (!checkId);
        return id;
    }
}
