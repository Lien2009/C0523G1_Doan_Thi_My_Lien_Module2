package furamaResort.model;

import java.time.LocalDate;

public class Contract extends Booking{
    private String contractId;
    private Double totalCost;

    public Contract() {
    }

    public Contract(String bookingId, String customerId, String facilityId, LocalDate start, LocalDate end,
                    String contractId, Double totalCost) {
        super(bookingId, customerId, facilityId, start, end);
        this.contractId = contractId;
        this.totalCost = totalCost;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractId='" + contractId + '\'' +
                ", totalCost=" + totalCost +
                '}';
    }
}
