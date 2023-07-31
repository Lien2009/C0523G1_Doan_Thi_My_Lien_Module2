package furamaResort.regex;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EmployeeRegex {
    private static final String REGEX_ID = "^NV-[0-9]{4}$";
    private static final String REGEX_NAME = "^[A-Z][a-z]*\\s[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
    private static final String REGEX_IDENTIFY = "^[0-9]{9}$|^[0-9]{12}$";
    private static final String REGEX_PHONE = "^0[0-9]{9}$";
    private static final String REGEX_DATE = "^[0-9]{2}/[0-9]{2}/[0-9]{4}$";

    static Scanner scanner = new Scanner(System.in);

    public static boolean checkId(String id) {
        boolean checkId = id.matches(REGEX_ID);
        if (!checkId) {
            System.out.println("Enter Id again!");
        }
        return checkId;
    }

    public static boolean checkIdentify(String identify) {
        boolean checkIdentify = identify.matches(REGEX_IDENTIFY);
        if (!checkIdentify) {
            System.out.println("Enter Identify number again!");
        }
        return checkIdentify;
    }

    public static boolean checkPhone(String phoneNumber) {
        boolean checkPhone = phoneNumber.matches(REGEX_PHONE);
        if (!checkPhone) {
            System.out.println("Enter Phone number again!");
        }
        return checkPhone;
    }

    public static boolean checkName(String name) {
        boolean checkName = name.matches(REGEX_NAME);
        if (!checkName) {
            System.out.println("Enter name again!");
        }
        return checkName;
    }

    public static String checkDate() {
        boolean checkDate;
        String date;
        long year;
        do {
            do {
                date = scanner.nextLine();
                checkDate = date.matches(REGEX_DATE);
                if (!checkDate) {
                    System.out.println("Enter date of birth again!");
                }
            } while (!checkDate);
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date1 = LocalDate.parse(date, fmt);//ép kiểu từ string về local date
            LocalDate currentDate = LocalDate.now();
            year = ChronoUnit.YEARS.between(date1, currentDate);
            if (year < 18) {
                System.out.println("Not allow under 18 years!");
            }
        } while (year < 18);
        return date;
    }

    public static String level() {
        System.out.println("1.Trung cấp");
        System.out.println("2.Cao đẳng");
        System.out.println("3.Đại học");
        System.out.println("4.Sau đại học");
        String level = "";
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                level = "Trung cấp";
                break;
            case 2:
                level = "Cao đẳng";
                break;
            case 3:
                level = "Đại học";
                break;
            case 4:
                level = "Sau đại học";
                break;
        }
        return level;
    }

    public static String position() {
        System.out.println("1.Lễ tân");
        System.out.println("2.Phục vụ");
        System.out.println("3.Chuyên viên");
        System.out.println("4.Giám sát");
        System.out.println("5.Quản lý");
        System.out.println("6.Giám đốc");
        String position = "";
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                position = "Lễ tân";
                break;
            case 2:
                position = "Phục vụ";
                break;
            case 3:
                position = "Chuyên viên";
                break;
            case 4:
                position = "Giám sát";
                break;
            case 5:
                position = "Quản lý";
                break;
            case 6:
                position = "Giám đốc";
                break;
        }
        return position;
    }
}
