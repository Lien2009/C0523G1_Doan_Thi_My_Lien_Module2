package ss10.exercise.exercise1;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> listTest = new MyList<>();
        listTest.add(0,"Liên");
        listTest.add(1,"Hạnh");
        listTest.add(2,"Hậu");
        listTest.add(4,"Long");

        System.out.println(listTest.get(0));
        System.out.println(listTest.get(1));
        System.out.println(listTest.get(3));
        listTest.remove(1);
        System.out.println(listTest.get(1));

    }
}
