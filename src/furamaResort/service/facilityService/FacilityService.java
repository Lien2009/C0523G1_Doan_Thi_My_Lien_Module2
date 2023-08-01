package furamaResort.service.facilityService;

import furamaResort.controller.FacilityController;
import furamaResort.model.Facility;
import furamaResort.model.House;
import furamaResort.model.Room;
import furamaResort.model.Villa;
import furamaResort.regex.FacilityRegex;
import furamaResort.repository.facilityRepository.FacilityRepository;
import furamaResort.repository.facilityRepository.IFacilityRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    IFacilityRepository repository = new FacilityRepository();

    @Override
    public void display() {
        Map<Facility, Integer> facilityMap = repository.display();
        for (Facility key : facilityMap.keySet()) {
            System.out.println(key + "-" + facilityMap.get(key));
        }
    }

    @Override
    public void add() {
        List<Facility> facilityList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Add New Villa");
        System.out.println("2.Add New House");
        System.out.println("3.Add New Room");
        System.out.println("4.Back to menu");
        System.out.println("Enter number:");
        int choose = Integer.parseInt(scanner.nextLine());
        if (choose == 4) {
            FacilityController.showFacilityMenu();
        }
        System.out.println("Enter ID:");
        String id = FacilityRegex.checkId();
        if (repository.findKey(id)) {
            System.out.println("Don't add an already existing ID");
            return;
        }
        System.out.println("Enter name:");
        String name = FacilityRegex.checkName();
        System.out.println("Enter area:");
        double area = FacilityRegex.checkArea();
        System.out.println("Enter cost");
        double cost = FacilityRegex.checkCost();
        System.out.println("Enter capacity:");
        int capacity = FacilityRegex.checkCapacity();
        System.out.println("Enter rent type:");
        String rentType = FacilityRegex.checkName();
        String villaStandard;
        double poolArea;
        int floor;
        int floorR;
        String service;
        switch (choose) {
            case 1:
                System.out.println("Enter villa standard:");
                villaStandard = scanner.nextLine();
                System.out.println("Enter pool area:");
                poolArea = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter floor:");
                floor = Integer.parseInt(scanner.nextLine());
                Facility villa = new Villa(id, name, area, cost, capacity, rentType, villaStandard, poolArea, floor);
                facilityList.add(villa);
                break;
            case 2:
                System.out.println("Enter room standard:");
                String roomStandard = scanner.nextLine();
                System.out.println("Enter floor:");
                floorR = Integer.parseInt(scanner.nextLine());
                Facility house = new House(id, name, area, cost, capacity, rentType, roomStandard, floorR);
                facilityList.add(house);
                break;
            case 3:
                System.out.println("Enter free service included:");
                service = scanner.nextLine();
                Facility room = new Room(id, name, area, cost, capacity, rentType, service);
                facilityList.add(room);
                break;
        }
        repository.add(facilityList);
    }

    @Override
    public void displayMaintenance() {
        Map<Facility, Integer> maintenance = repository.displayMaintenance();
        System.out.println(maintenance);
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID:");
        String id = FacilityRegex.checkId();
        if (repository.findKey(id) == false) {
            System.out.println("Not found");
            return;
        }
        repository.delete(id);
    }
}
