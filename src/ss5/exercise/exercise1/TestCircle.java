package ss5.exercise.exercise1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        Circle circle1 = new Circle(2.5);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());

    }
}
