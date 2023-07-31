package furamaResort.model;

import java.time.LocalDate;

public class Booking {
    private String bookingId;
    private String customerId;
    private String facilityId;
    private LocalDate start;
    private LocalDate end;

    public Booking() {
    }

    public Booking(String bookingId, String customerId, String facilityId, LocalDate start, LocalDate end) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.facilityId = facilityId;
        this.start = start;
        this.end = end;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", facilityId='" + facilityId + '\'' +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
