package ss6.exercise.exercise2;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float getXYZ[] = {super.getX(), super.getY(), getZ()};
        return getXYZ;
    }

    @Override
    public String toString() {
        return "Point3D(" +
                super.getX() + ',' + super.getY() + ',' + getZ() +
                ')';
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(1, 2.5f, 4);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D);
    }
}
