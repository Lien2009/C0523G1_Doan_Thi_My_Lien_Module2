package furamaResort.repository.facility;

import furamaResort.model.Facility;

import java.util.List;
import java.util.Map;

public interface IFacilityRepository {
    boolean findKey(String id);
    Map<Facility, Integer> getAll();
    Map<Facility, Integer> getAllVilla();
    Map<Facility, Integer> getAllHouse();
    Map<Facility, Integer> getAllRoom();

    void add(List<Facility> elements);
    Map<Facility, Integer> getAllMaintenance();
    void delete(String id);

}
