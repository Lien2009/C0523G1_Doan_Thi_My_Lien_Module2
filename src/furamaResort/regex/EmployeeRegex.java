package furamaResort.regex;

import java.util.Scanner;

public class EmployeeRegex {
    private static final String REGEX_ID = "^NV-[0-9]{4}$";
    private static final String REGEX_NAME = "^([A-Z]{1}[a-z]+\\s)+$";
    private static final String REGEX_IDENTIFY = "^[0-9]{9}$|^[0-9]{12}$";
    private static final String REGEX_PHONE = "^0[0-9]{9}$";

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

    public static String checkIdentify() {
        boolean checkIdentify;
        String identify;
        do {
            identify = scanner.nextLine();
            checkIdentify = identify.matches(REGEX_IDENTIFY);
            if (!checkIdentify) {
                System.out.println("Enter Identify number again!");
            }
        } while (!checkIdentify);
        return identify;
    }

    public static String checkPhone() {
        boolean checkPhone;
        String phoneNumber;
        do {
            phoneNumber = scanner.nextLine();
            checkPhone = phoneNumber.matches(REGEX_PHONE);
            if (!checkPhone) {
                System.out.println("Enter Phone number again!");
            }
        } while (!checkPhone);
        return phoneNumber;
    }

    public static void main(String[] args) {
checkPhone();
    }

}
