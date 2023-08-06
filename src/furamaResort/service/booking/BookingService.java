package furamaResort.service.booking;

import furamaResort.model.Booking;
import furamaResort.repository.booking.BookingRepository;
import furamaResort.repository.booking.IBookingRepository;
import furamaResort.service.customer.CustomerService;
import furamaResort.service.customer.ICustomerService;
import furamaResort.service.facility.FacilityService;
import furamaResort.service.facility.IFacilityService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;


public class BookingService implements IBookingService {
    IBookingRepository repository = new BookingRepository();

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Booking ID:");
        String id = scanner.nextLine();
        System.out.println("Choose Customer ID:");
        ICustomerService service = new CustomerService();
        service.getAll();
        String customerId = scanner.nextLine();
        System.out.println("Choose Facility ID:");
        IFacilityService service1 = new FacilityService();
        service1.getAll();
        String facilityId = scanner.nextLine();
        System.out.println("Enter start date(YYYY-MM-DD):");
        LocalDate start = LocalDate.parse(scanner.nextLine());
        System.out.println("Enter end date(YYYY-MM-DD):");
        LocalDate end = LocalDate.parse(scanner.nextLine());
        repository.add(new Booking(id, customerId, facilityId, start, end));
    }

    @Override
    public void getAll() {
        List<Booking> bookingSet = repository.getAll();
        for(Booking booking:bookingSet){
            System.out.println(booking);
        }
    }
}
