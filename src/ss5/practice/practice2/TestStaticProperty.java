package ss5.practice.practice2;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazada 3","Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazada 4","Skyactiv 4");
        System.out.println(Car.numberOfCars);

    }
}
