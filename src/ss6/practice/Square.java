package ss6.practice;

public class Square extends Rectangle {
    public Square(){

    }

    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    public String toString() {
        return "A Square with side = "+this.getSide()+ ", Which is a subclass of "+ super.toString();
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square(5.8,"yellow",true);
        System.out.println(square);

    }
}
