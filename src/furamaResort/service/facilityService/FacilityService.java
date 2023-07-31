package furamaResort.service.facilityService;

import furamaResort.model.Facility;
import furamaResort.regex.FacilityRegex;
import furamaResort.repository.facilityRepository.FacilityRepository;
import furamaResort.repository.facilityRepository.IFacilityRepository;

import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    IFacilityRepository repository = new FacilityRepository();

    @Override
    public void display() {
       Map<Facility,Integer> facilityMap = repository.display();
       for(Facility key:facilityMap.keySet()){
           System.out.println(key+"-"+facilityMap.get(key));
       }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Add New Villa");
        System.out.println("2.Add New House");
        System.out.println("3.Add New Room");
        System.out.println("4.Back to menu");//chưa hiểu đoạn này?
//        System.out.println("Enter number:");
//        int choose = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter ID:");
        String id = FacilityRegex.checkId();
        if(repository.findKey(id)){
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
        repository.add(new Facility(id,name,area,cost,capacity,rentType));
    }

    @Override
    public void displayMaintenance() {

    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID:");
        String id = FacilityRegex.checkId();
        if(!repository.findKey(id)){
            System.out.println("Not found");
            return;
        }
        repository.delete(id);
    }
}
