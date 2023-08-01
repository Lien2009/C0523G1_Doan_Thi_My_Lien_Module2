package furamaResort.controller;

import furamaResort.service.facilityService.FacilityService;
import furamaResort.service.facilityService.IFacilityService;

import java.util.Scanner;

public class FacilityController {
    public static void showFacilityMenu() {
        IFacilityService service = new FacilityService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---FACILITY---");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Delete facility");
            System.out.println("5. Return main menu");
            System.out.println("Enter your choose:");
            int choose = 0;
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Enter number format");
            }
            switch (choose) {
                case 1:
                    service.display();
                    break;
                case 2:
                    service.add();
                    break;
                case 3:
                    service.displayMaintenance();
                    break;
                case 4:
                    service.delete();
                    break;
                case 5:
                    FuramaController.displayMainMenu();
            }
        } while (true);
    }
}
