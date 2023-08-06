package furamaResort.repository.contract;

import furamaResort.model.Contract;
import furamaResort.repository.booking.BookingRepository;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class ContractRepository implements IContractRepository {
    BookingRepository bookingRepository = new BookingRepository();
    private static Set<Contract> contracts = new HashSet<>();

    static {
        contracts.add(new Contract("BK1", "KH-0123", "SVVL-0123",
                LocalDate.parse("2023-07-20"), LocalDate.parse("2023-07-21"), "CT1", 1000.0));
    }

    @Override
    public void create(Contract contract) {
        contracts.add(contract);
        bookingRepository.delete(contract.getBookingId());
    }

    @Override
    public Set<Contract> displayContract() {
        return contracts;
    }

    @Override
    public void edit(String id, Contract contract) {
        for (Contract contract1 : contracts) {
            if (contract1.getContractId().equals(id)) {
                contract1.setBookingId(contract.getBookingId());
                contract1.setCustomerId(contract.getCustomerId());
                contract1.setFacilityId(contract.getFacilityId());
                contract1.setStart(contract.getStart());
                contract1.setEnd(contract.getEnd());
                contract1.setContractId(contract.getContractId());
                contract1.setTotalCost(contract.getTotalCost());
                break;
            }
        }
    }
}
