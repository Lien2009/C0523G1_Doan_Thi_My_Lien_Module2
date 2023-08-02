package furamaResort.repository.contract;

import furamaResort.model.Contract;

import java.util.Set;

public interface IContractRepository {
    void create(Contract contract);
    Set<Contract> displayContract();
    void edit(String id, Contract contract);
}
