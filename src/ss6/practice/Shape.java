package ss6.practice;

public class Shape {
    private String color;
    private boolean filled;
    public  Shape(){
        this("green",true);
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString(){
        return "A Shape with color of "+this.color+" and " + this.filled;
    }
}
