package ss10.exercise.exercise1;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> listTest = new MyList<>();
        listTest.add("A");
        listTest.add("B");
        listTest.add("C");
        listTest.add("D");
//        listTest.add(1, "E");
//        for (int i = 0; i < listTest.size; i++) {//test add
//            System.out.println(listTest.get(i));
//        }
//        listTest.remove(2);
//        for (int i = 0; i < listTest.size; i++) {//test remove
//            System.out.println(listTest.get(i));
//        }
//        MyList<String> list2 = listTest.clone();//test clone
//        for (int i = 0; i < list2.size; i++) {
//            System.out.println(list2.get(i));
//        }
        System.out.println(listTest.indexOf("A"));//test indexOf
        System.out.println(listTest.indexOf("g"));//test indexOf
//        System.out.println(listTest.contains("g"));//test contains
//        listTest.clear();//test clear
//        for (int i = 0; i < listTest.size; i++) {
//            System.out.println(listTest.get(i));
//        }
        listTest.add("VI");
        for (int i = 0; i < listTest.size; i++) {
            System.out.println(listTest.get(i));
        }
    }
}
