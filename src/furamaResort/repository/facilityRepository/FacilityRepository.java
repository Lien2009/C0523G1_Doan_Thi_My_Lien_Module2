package furamaResort.repository.facilityRepository;

import furamaResort.model.Facility;
import furamaResort.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    public static final String FACILITY_FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\furamaResort\\data\\facility.csv";
    public static final String FACILITY_MTN_FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\furamaResort\\data\\facility_maintenance.csv";


    @Override
    public boolean findKey(String id) {
        boolean result = display().containsKey(new Facility(id));
        return result;
    }

    @Override
    public Map<Facility, Integer> display() {
        Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWrite.readFile(FACILITY_FILE);
        String[] array;
        for (String string : stringList) {
            array = string.split(",");
            Facility facility = new Facility(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]), Integer.parseInt(array[4]), array[5]);
            facilityMap.put(facility, 0);
        }
        return facilityMap;
    }

    @Override
    public void add(Facility facility) {
        List<String> stringList = new ArrayList<>();
        stringList.add(facility.getInfoCSV());
        ReadAndWrite.writeFile(FACILITY_FILE, stringList, true);
    }

    @Override
    public Map<Facility, Integer> displayMaintenance() {
        return null;
    }

    @Override
    public void delete(String id) {
        Map<Facility, Integer> facilityMap = display();
        facilityMap.remove(new Facility(id));
        List<String> stringList = new ArrayList<>();
        for (Facility facility : facilityMap.keySet()) {
            stringList.add(facility.getInfoCSV());
        }
        ReadAndWrite.writeFile(FACILITY_FILE, stringList, false);
    }
}
