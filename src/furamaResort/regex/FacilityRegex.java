package furamaResort.regex;

import java.util.Scanner;

public class FacilityRegex {
    public static final String REGEX_ID = "^SVVL-[0-9]{4}$|^SVHO-[0-9]{4}$|^SVRO-[0-9]{4}$";
    public static final String REGEX_NAME = "^[A-Z][a-z]+$";

    static Scanner scanner = new Scanner(System.in);

    public static String checkId() {
        boolean checkId;
        String id;
        do {
            id = scanner.nextLine();
            if (!id.matches(REGEX_ID)) {
                System.out.println("Enter ID again!");
            }
        } while (!id.matches(REGEX_ID));
        return id;
    }

    public static String checkName() {
        boolean checkName;
        String name;
        do {
            name = scanner.nextLine();
            if (!name.matches(REGEX_NAME)) {
                System.out.println("Enter name again!");
            }
        } while (!name.matches(REGEX_NAME));
        return name;
    }

    public static double checkArea() {
        double area;
        do {
            area = Double.parseDouble(scanner.nextLine());
            if (area <= 30) {
                System.out.println("Must be greater than 30m2!");
            }
        } while (area <= 30);
        return area;
    }

    public static double checkCost() {
        double cost;
        do {
            cost = Double.parseDouble(scanner.nextLine());
            if (cost <= 0) {
                System.out.println("Must be greater than 0!");
            }
        } while (cost <= 0);
        return cost;
    }

    public static int checkCapacity() {
        int capacity;
        do {
            capacity = Integer.parseInt(scanner.nextLine());
            if (capacity <= 0 || capacity >= 20) {
                System.out.println("Capacity is between 0 and 20!");
            }
        } while (capacity <= 0 || capacity >= 20);
        return capacity;
    }

    public static int checkFloor() {
        int floor;
        do {
            floor = Integer.parseInt(scanner.nextLine());
            if (floor <= 0) {
                System.out.println("Must be greater than 0!");
            }
        } while (floor <= 0);
        return floor;
    }
}
