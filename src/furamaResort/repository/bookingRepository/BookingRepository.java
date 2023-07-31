package furamaResort.repository.bookingRepository;

import furamaResort.model.Booking;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BookingRepository implements IBookingRepository {
    static List<Booking> bookings = new ArrayList<>();

    static {
        LocalDate start1 = LocalDate.of(2023, 7, 20);
        LocalDate end1 = LocalDate.of(2023, 7, 21);
//        LocalDate start2 = LocalDate.parse("2023-07-10");
//        LocalDate end2 = LocalDate.parse("2023-07-20");

        bookings.add(new Booking("BK1", "KH-0123", "SVVL-0123", start1, end1));
        bookings.add(new Booking("BK2", "KH-0124", "SVVL-0124", LocalDate.parse("2023-07-20"), LocalDate.parse("2023-07-30")));
    }

    @Override
    public void add(Booking booking) {
        bookings.add(booking);
    }

    @Override
    public List<Booking> display() {
        return bookings;
    }
}
