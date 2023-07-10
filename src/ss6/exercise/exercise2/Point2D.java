package ss6.exercise.exercise2;

import java.util.Scanner;

public class Point2D {
    private float x;
    private float y;
    public Point2D(){
        this(0.0f,0.0f);
    }
    public Point2D(float x, float y) {
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
        float[] getXY = new float[2];
        getXY[0] = getX();
        getXY[1] = getY();
        return getXY;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tọa độ x:");
        float x = scanner.nextFloat();
        System.out.println("Nhập tọa độ y:");
        float y = scanner.nextFloat();
        Point2D point2D = new Point2D(x,y);
        System.out.println(point2D);
    }
}
