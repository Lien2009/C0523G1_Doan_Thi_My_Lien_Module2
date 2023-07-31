package furamaResort.service.bookingService;

import furamaResort.model.Booking;
import furamaResort.model.Facility;
import furamaResort.repository.bookingRepository.BookingRepository;
import furamaResort.repository.bookingRepository.IBookingRepository;
import furamaResort.service.customerService.CustomerService;
import furamaResort.service.customerService.ICustomerService;
import furamaResort.service.facilityService.FacilityService;
import furamaResort.service.facilityService.IFacilityService;
import furamaResort.utils.ReadAndWrite;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class BookingService implements IBookingService {
    IBookingRepository repository = new BookingRepository();

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Booking ID:");
        String id = scanner.nextLine();
        System.out.println("Choose Customer ID:");
        ICustomerService service = new CustomerService();
        service.display();
        String customerId = scanner.nextLine();
        System.out.println("Choose Facility ID:");
        IFacilityService service1 = new FacilityService();
        service1.display();
        String facilityId = scanner.nextLine();
        System.out.println("Enter start date(YYYY-MM-DD):");
        LocalDate start = LocalDate.parse(scanner.nextLine());
        System.out.println("Enter end date(YYYY-MM-DD):");
        LocalDate end = LocalDate.parse(scanner.nextLine());
        repository.add(new Booking(id, customerId, facilityId, start, end));
    }

    @Override
    public void display() {
        List<Booking> bookingSet = repository.display();
        System.out.println(bookingSet);
    }
}
