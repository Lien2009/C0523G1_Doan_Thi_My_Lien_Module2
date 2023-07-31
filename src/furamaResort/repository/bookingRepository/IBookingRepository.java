package furamaResort.repository.bookingRepository;

import furamaResort.model.Booking;
import furamaResort.model.Contract;

import java.util.List;
import java.util.Set;

public interface IBookingRepository {
    void add(Booking booking);
    List<Booking> display();
}
