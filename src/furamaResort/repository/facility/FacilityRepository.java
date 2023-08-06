package furamaResort.repository.facility;

import furamaResort.model.Facility;
import furamaResort.model.House;
import furamaResort.model.Room;
import furamaResort.model.Villa;
import furamaResort.utils.ReadAndWrite;

import java.util.*;

public class FacilityRepository implements IFacilityRepository {
    public static final String VILLA_FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\furamaResort\\data\\villa.csv";
    public static final String HOUSE_FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\furamaResort\\data\\house.csv";
    public static final String ROOM_FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\furamaResort\\data\\room.csv";

    @Override
    public boolean checkId(String id) {
        for (Facility facility : getAll().keySet()) {
            if (facility.getId().equals(id)) {
                return true;//có thì true
            }
        }
        return false;
    }

    @Override
    public Map<Facility, Integer> getAll() {
        Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
        facilityMap.putAll(getAllVilla());
        facilityMap.putAll(getAllHouse());
        facilityMap.putAll(getAllRoom());
        return facilityMap;
    }

    public Map<Facility, Integer> getAllVilla() {
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
    public Map<Facility, Integer> getAllHouse() {
        Map<Facility, Integer> houseMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWrite.readFile(HOUSE_FILE);
        String[] array;
        for (String string : stringList) {
            array = string.split(",");
            House house = new House(array[0], array[1], Double.parseDouble(array[2]),
                    Double.parseDouble(array[3]), Integer.parseInt(array[4]), array[5], array[6],
                    Integer.parseInt(array[7]));
            houseMap.put(house, Integer.parseInt(array[8]));
        }
        return houseMap;
    }

    @Override
    public Map<Facility, Integer> getAllRoom() {
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
                    ReadAndWrite.writeFile(VILLA_FILE, villaList, true);
                    break;
                case "House":
                    houseList.add(e.getInfoCSV() + "," + "0");
                    ReadAndWrite.writeFile(HOUSE_FILE, houseList, true);
                    break;
                case "Room":
                    roomList.add(e.getInfoCSV() + "," + "0");
                    ReadAndWrite.writeFile(ROOM_FILE, roomList, true);
                    break;
            }
        }
    }

    @Override
    public Map<Facility, Integer> getAllMaintenance() {
        Map<Facility, Integer> maintenance = new LinkedHashMap<>();
        for (Facility f : getAll().keySet()) {
            if (getAll().get(f) >= 5) {
                maintenance.put(f, getAll().get(f));
            }
        }
        return maintenance;
    }

    @Override
    public void delete(String id) {
        if (id.contains("VL")) {
            List<String> villaList = ReadAndWrite.readFile(VILLA_FILE);
            for (int i = 0; i < villaList.size(); i++) {
                if (villaList.get(i).contains(id)) {
                    villaList.remove(i);
                    break;
                }
            }
            ReadAndWrite.writeFile(VILLA_FILE, villaList, false);
        } else if (id.contains("HO")) {
            List<String> houseList = ReadAndWrite.readFile(HOUSE_FILE);
            for (int i = 0; i < houseList.size(); i++) {
                if (houseList.get(i).contains(id)) {
                    houseList.remove(i);
                    break;
                }
            }
            ReadAndWrite.writeFile(HOUSE_FILE, houseList, false);
        } else {
            List<String> roomList = ReadAndWrite.readFile(ROOM_FILE);
            for (int i = 0; i < roomList.size(); i++) {
                if (roomList.get(i).contains(id)) {
                    roomList.remove(i);
                    break;
                }
            }
            ReadAndWrite.writeFile(HOUSE_FILE, roomList, false);
        }
    }
}
