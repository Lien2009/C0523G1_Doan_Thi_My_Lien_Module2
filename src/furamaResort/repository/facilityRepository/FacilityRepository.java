package furamaResort.repository.facilityRepository;

import furamaResort.model.Facility;
import furamaResort.model.House;
import furamaResort.model.Room;
import furamaResort.model.Villa;
import furamaResort.utils.ReadAndWrite;

import java.util.*;

public class FacilityRepository implements IFacilityRepository {
    public static final String FACILITY_FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\furamaResort\\data\\facility.csv";
    public static final String FACILITY_MTN_FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\furamaResort\\data\\facility_maintenance.csv";
    public static final String VILLA_FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\furamaResort\\data\\villa.csv";
    public static final String HOUSE_FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\furamaResort\\data\\house.csv";
    public static final String ROOM_FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\furamaResort\\data\\room.csv";

    @Override
    public boolean findKey(String id) {
        for (Facility facility : display().keySet()) {
            if(facility.getId().equals(id)){
                return true;//có thì true
            }
        }
        return false;
    }

    @Override
    public Map<Facility, Integer> display() {
        Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
        facilityMap.putAll(displayVilla());
        facilityMap.putAll(displayHouse());
        facilityMap.putAll(displayRoom());
//        List<String> stringList = ReadAndWrite.readFile(FACILITY_FILE);
//        String[] array;
//        for (String string : stringList) {
//            array = string.split(",");
//            Facility facility = new Facility(array[0], array[1], Double.parseDouble(array[2]),
//                    Double.parseDouble(array[3]), Integer.parseInt(array[4]), array[5]);
//            facilityMap.put(facility, Integer.parseInt(array[6]));
//        }
        return facilityMap;
    }

    public Map<Facility, Integer> displayVilla() {
        Map<Facility, Integer> villaMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWrite.readFile(VILLA_FILE);
        String[] array;
        for (String string : stringList) {
            array = string.split(",");
            Villa villa = new Villa(array[0], array[1], Double.parseDouble(array[2]),
                    Double.parseDouble(array[3]), Integer.parseInt(array[4]), array[5], array[6],
                    Double.parseDouble(array[7]), Integer.parseInt(array[8]));
            villaMap.put(villa, Integer.parseInt(array[9]));
        }
        return villaMap;
    }

    @Override
    public Map<Facility, Integer> displayHouse() {
        Map<Facility, Integer> houseMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWrite.readFile(HOUSE_FILE);
        String[] array;
        for (String string : stringList) {
            array = string.split(",");
            House house = new House(array[0], array[1], Double.parseDouble(array[2]),
                    Double.parseDouble(array[3]), Integer.parseInt(array[4]), array[5], array[6], Integer.parseInt(array[7]));
            houseMap.put(house, Integer.parseInt(array[8]));
        }
        return houseMap;
    }

    @Override
    public Map<Facility, Integer> displayRoom() {
        Map<Facility, Integer> roomMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWrite.readFile(ROOM_FILE);
        String[] array;
        for (String string : stringList) {
            array = string.split(",");
            Room room = new Room(array[0], array[1], Double.parseDouble(array[2]),
                    Double.parseDouble(array[3]), Integer.parseInt(array[4]), array[5], array[6]);
            roomMap.put(room, Integer.parseInt(array[7]));
        }
        return roomMap;
    }


    @Override
    public void add(List<Facility> elements) {
        List<String> villaList = new ArrayList<>();
        List<String> houseList = new ArrayList<>();
        List<String> roomList = new ArrayList<>();
        for (Facility e : elements) {
            switch (e.getName()) {
                case "Villa":
                    villaList.add(e.getInfoCSV() + "," + "0");
                    break;
                case "House":
                    houseList.add(e.getInfoCSV() + "," + "0");
                    break;
                case "Room":
                    roomList.add(e.getInfoCSV() + "," + "0");
                    break;

            }
        }
        ReadAndWrite.writeFile(VILLA_FILE, villaList, true);
        ReadAndWrite.writeFile(HOUSE_FILE, houseList, true);
        ReadAndWrite.writeFile(ROOM_FILE, roomList, true);
    }

    @Override
    public Map<Facility, Integer> displayMaintenance() {
        Map<Facility,Integer> maintenance = new LinkedHashMap<>();
        for(Facility f: display().keySet()){
            if(display().get(f) >= 5){
                maintenance.put(f,display().get(f));
            }
        }
        return maintenance;
    }

    @Override
    public void delete(String id) {
        Map<Facility, Integer> facilityMap = display();
        for(Facility facility:facilityMap.keySet()){
            if(facility.getId().equals(id)){
                facilityMap.remove(facility);
            }
        }
        List<String> villaList = new ArrayList<>();
        List<String> houseList = new ArrayList<>();
        List<String> roomList = new ArrayList<>();
        for (Facility facility : facilityMap.keySet()) {
            switch (facility.getName()){
                case "Villa":
                    villaList.add(facility.getInfoCSV()+ "," + facilityMap.get(facility));
                    break;
                case "House":
                    houseList.add(facility.getInfoCSV()+ "," + facilityMap.get(facility));
                    break;
                case "Room":
                    roomList.add(facility.getInfoCSV()+ "," + facilityMap.get(facility));
                    break;
            }
        }
        ReadAndWrite.writeFile(VILLA_FILE, villaList, false);
        ReadAndWrite.writeFile(HOUSE_FILE, houseList, false);
        ReadAndWrite.writeFile(ROOM_FILE, roomList, false);
    }
}
