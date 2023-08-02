package furamaResort.controller;

import furamaResort.service.booking.BookingService;
import furamaResort.service.booking.IBookingService;
import furamaResort.service.contract.ContractService;
import furamaResort.service.contract.IContractService;

import java.util.Scanner;

public class BookingController {
    public static void showBookingMenu() {
        IBookingService service = new BookingService();
        IContractService service1 = new ContractService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---BOOKING---");
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            System.out.println("Enter number:");
            int number = 0;
            try {
                number = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Enter number format!");
            }
            switch (number) {
                case 1:
                    service.add();
                    break;
                case 2:
                    service.getAll();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    FuramaController.displayMainMenu();
                    break;
            }
        } while (true);
    }


}
