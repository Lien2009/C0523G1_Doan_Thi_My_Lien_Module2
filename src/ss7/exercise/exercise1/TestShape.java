package ss7.exercise.exercise1;

import java.util.Arrays;

public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1);
        shapes[1] = new Rectangle(2,4);
        shapes[2] = new Square(3);
        System.out.println("Trước khi thay đổi:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("Sau khi thay đổi");
        for (Shape shape : shapes) {
            shape.resize(0.1);
            System.out.println(shape);
        }
    }
}
