package ss10.practice.practice1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInterger = new MyList<Integer>();
        listInterger.add(1);
        listInterger.add(2);
        listInterger.add(3);
        listInterger.add(3);
        listInterger.add(4);
        System.out.println("element 1: "+listInterger.get(0));
        System.out.println("element 5: "+listInterger.get(4));

        listInterger.add(10);
        System.out.println("element 7: "+listInterger.get(-1));
    }
}
