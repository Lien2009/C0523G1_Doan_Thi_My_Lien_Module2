package furamaResort;

import furamaResort.model.Facility;

import java.util.LinkedHashMap;
import java.util.Map;

public class Nhap {
    public static void main(String[] args) {
//        FacilityRepository repo = new FacilityRepository();
            Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
            facilityMap.put(new Facility("1","Room",1.0,2.0,3,"a"),0);
            facilityMap.put(new Facility("2","Room",2.0,2.0,3,"a"),0);
            int index;
//            for (Facility key : facilityMap.keySet()) {
        System.out.println(facilityMap.containsKey(new Facility("3"))); ;
//            }

        }
//        String day = "20/09/1996";
//        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate day1 = LocalDate.parse(day,fmt2);
//        LocalDate birthDay = LocalDate.of(1996,7,30);
//        LocalDate currentDay = LocalDate.now();
//        long year = ChronoUnit.YEARS.between(day1,currentDay);
//        System.out.println(year);
//        List<Customer> customerList = new ArrayList<>();
//        customerList.add(new Customer("KH-1000","Hanh","15","F","123456788","0123123123","sd","sd","sd"));
//        customerList.add(new Customer("KH-1111","Hanh","15","F","123456788","0123123123","sd","sd","sd"));
//        customerList.add(new Customer("KH-2111","Hanh","15","F","123456788","0123123123","sd","sd","sd"));
//        System.out.println(customerList.get(0).getId().equals("KH-1000"));
//        System.out.println(customerList.get(0).getId().equals("KH-1001"));
//        int index = -1;
//        for (Customer customer:customerList) {
//            if (customer.getId().equals("KH-111")) {
//                index = customerList.indexOf(customer);
//            }
//        }
//        System.out.println(index);;
//
//        boolean flag = false;
//        for (int i = 0; i < customerList.size(); i++) {
//            if (customerList.get(i).getId().equals("KH-1001")) {
//                flag = true;
//                customerList.set(i, new Customer("KH-2222","Hanh","15","F","123456788","0123123123","sd","sd","sd"));
//                break;
//            }
//        }
//
//        if(flag == false) {
//            System.out.println("Not found");
//
//        } else {
//            System.out.println(customerList.get(0));
//        }
//
//    }
}
