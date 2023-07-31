package furamaResort.repository.facilityRepository;

import furamaResort.model.Facility;

import java.util.LinkedHashMap;
import java.util.Map;

public interface IFacilityRepository {
    boolean findKey(String id);
    Map<Facility, Integer> display();
    void add(Facility facility);
    Map<Facility, Integer> displayMaintenance();
    void delete(String id);

}
