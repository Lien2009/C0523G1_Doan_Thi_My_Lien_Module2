package furamaResort.service.contract;

import furamaResort.model.Booking;
import furamaResort.model.Contract;
import furamaResort.repository.booking.BookingRepository;
import furamaResort.repository.booking.IBookingRepository;
import furamaResort.repository.contract.ContractRepository;
import furamaResort.repository.contract.IContractRepository;


import java.time.LocalDate;
import java.util.Scanner;
import java.util.Set;

public class ContractService implements IContractService {
    IContractRepository repository = new ContractRepository();
    IBookingRepository bookingRepository = new BookingRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void create() {
        System.out.println("Enter booking Id:");
        String bookingID = scanner.nextLine();
        int index = bookingRepository.getAll().indexOf(new Booking(bookingID));
        Booking booking = bookingRepository.getAll().get(index);
        System.out.println("Enter contract Id:");
        String contractID = scanner.nextLine();
        System.out.println("Enter cost:");
        Double cost = Double.parseDouble(scanner.nextLine());
        Contract contract = new Contract(booking.getBookingId(), booking.getCustomerId(), booking.getFacilityId(), booking.getStart(), booking.getEnd(), contractID, cost);
        repository.create(contract);
    }

    @Override
    public void displayContract() {
        Set<Contract> contracts = repository.displayContract();
        for (Contract contract : contracts) {
            System.out.println(contracts);
        }
    }

    @Override
    public void edit() {
        System.out.println("Enter contract Id:");
        String contractID = scanner.nextLine();
        for (Contract contract : repository.displayContract()) {
            if (contract.getContractId().equals(contractID)) {
                System.out.println("Enter Booking ID:");
                String id = scanner.nextLine();
                System.out.println("Choose Customer ID:");
                String customerId = scanner.nextLine();
                System.out.println("Choose Facility ID:");
                String facilityId = scanner.nextLine();
                System.out.println("Enter start date(YYYY-MM-DD):");
                LocalDate start = LocalDate.parse(scanner.nextLine());
                System.out.println("Enter end date(YYYY-MM-DD):");
                LocalDate end = LocalDate.parse(scanner.nextLine());
                System.out.println("Enter cost:");
                Double cost = Double.parseDouble(scanner.nextLine());
                Contract contract1 = new Contract(id, customerId, facilityId, start, end, contractID, cost);
                repository.edit(contractID, contract1);
            } else {
                System.out.println("Not found!");
            }
        }
    }
}
