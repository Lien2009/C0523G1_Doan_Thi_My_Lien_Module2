package furamaResort.repository.facilityRepository;

import furamaResort.model.Facility;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface IFacilityRepository {
    boolean findKey(String id);
    Map<Facility, Integer> display();
    Map<Facility, Integer> displayVilla();
    Map<Facility, Integer> displayHouse();
    Map<Facility, Integer> displayRoom();

    void add(List<Facility> elements);
    Map<Facility, Integer> displayMaintenance();
    void delete(String id);

}
