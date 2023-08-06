package furamaResort.repository.booking;

import furamaResort.model.Booking;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookingRepository implements IBookingRepository {
    static List<Booking> bookings = new ArrayList<>();

    static {
        bookings.add(new Booking("BK1", "KH-0123", "SVVL-0123",
                LocalDate.parse("2023-07-20"), LocalDate.parse("2023-07-21")));
        bookings.add(new Booking("BK2", "KH-0124", "SVVL-0124",
                LocalDate.parse("2023-07-20"), LocalDate.parse("2023-07-30")));
    }

    @Override
    public void add(Booking booking) {
        bookings.add(booking);
    }

    @Override
    public List<Booking> getAll() {
        return bookings;
    }

    @Override
    public void delete(String id) {
        bookings.remove(new Booking(id));
    }
}
