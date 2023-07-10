package ss6.exercise.exercise3;

import java.util.Arrays;

public class Point {
    private float x;
    private float y;

    public Point() {
        this(0.0f, 0.0f);
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] getXY = {x,y};
        return getXY;
    }

    @Override
    public String toString() {
        return "Point(" +
                x + ',' + y +
                ')';
    }

    public static void main(String[] args) {
        Point point = new Point(4,2);
        System.out.println(point);
        point.setXY(5,6);
        System.out.println(Arrays.toString(point.getXY()));
    }
}
