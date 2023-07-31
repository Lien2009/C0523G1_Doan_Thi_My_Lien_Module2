package furamaResort.repository.facilityRepository;

import furamaResort.model.Facility;
import furamaResort.model.Villa;
import furamaResort.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    public static final String FACILITY_FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\furamaResort\\data\\facility.csv";
    public static final String FACILITY_MTN_FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\furamaResort\\data\\facility_maintenance.csv";
    public static final String VILLA_FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\furamaResort\\data\\villa.csv";
    public static final String HOUSE_FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\furamaResort\\data\\house.csv";
    public static final String ROOM_FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\furamaResort\\data\\room.csv";

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
            Facility facility = new Facility(array[0], array[1], Double.parseDouble(array[2]),
                    Double.parseDouble(array[3]), Integer.parseInt(array[4]), array[5]);
            facilityMap.put(facility, Integer.parseInt(array[6]));
        }
        return facilityMap;
    }

    public Map<Villa, Integer> displayVilla() {
        Map<Villa, Integer> villaMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWrite.readFile(VILLA_FILE);
        String[] array;
        for (String string : stringList) {
            array = string.split(",");
            Villa villa = new Villa(array[0], array[1], Double.parseDouble(array[2]),
                    Double.parseDouble(array[3]), Integer.parseInt(array[4]), array[5], array[6],
                    Double.parseDouble(array[7]),Integer.parseInt(array[8]));
            villaMap.put(villa, Integer.parseInt(array[9]));
        }
        return villaMap;
    }

    @Override
    public void add(Facility facility) {
        List<String> stringList = new ArrayList<>();
        stringList.add(facility.getInfoCSV() + "," + "0");//số lần sd mặc định 0
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
            stringList.add(facility.getInfoCSV() + "," + facilityMap.get(facility));
        }
        ReadAndWrite.writeFile(FACILITY_FILE, stringList, false);
    }
}
