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

    public static String type() {
        System.out.println("1.Diamond");
        System.out.println("2.Platinum");
        System.out.println("3.Gold");
        System.out.println("4.Silver");
        System.out.println("5.Member");
        String type = "";
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                type = "Diamond";
                break;
            case 2:
                type = "Platinum";
                break;
            case 3:
                type = "Gold";
                break;
            case 4:
                type = "Silver";
                break;
            case 5:
                type = "Member";
                break;
        }
        return type;
    }
}
