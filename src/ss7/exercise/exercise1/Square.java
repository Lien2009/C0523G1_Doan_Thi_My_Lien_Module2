package ss7.exercise.exercise1;

public class Square extends Rectangle implements Resizeable{
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public String toString() {
        return "A Square with side = " + this.getSide() + ", Which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        ss6.practice.Square square = new ss6.practice.Square();
        System.out.println(square);
        square = new ss6.practice.Square(2.3);
        System.out.println(square);
        square = new ss6.practice.Square(5.8, "yellow", true);
        System.out.println(square);

    }

    @Override
    public void resize(double percent) {
        setSide(getWidth() * Math.sqrt(1 + percent));
    }
}
