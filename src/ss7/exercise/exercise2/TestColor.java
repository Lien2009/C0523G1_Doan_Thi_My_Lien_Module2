package ss7.exercise.exercise2;

public class TestColor {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Square(3);
        shapes[1] = new Circle(2);
        for (Shape shape : shapes) {
            shape.howToColor();
            System.out.println("Diện tích là: " + shape.getArea());
        }
    }
}
