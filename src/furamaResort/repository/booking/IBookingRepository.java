package furamaResort.repository.booking;

import furamaResort.model.Booking;

import java.util.List;

public interface IBookingRepository {
    void add(Booking booking);
    List<Booking> getAll();
}
