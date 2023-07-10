package ss6.exercise.exercise3;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {

    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] getSpeed = {xSpeed, ySpeed};
        return getSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                super.toString() + ",speed=(" + xSpeed + ',' + ySpeed + ')' +
                '}';
    }

    public MovablePoint move() {
        super.setXY(super.getX() + xSpeed, super.getY() + ySpeed);
        return this;
    }

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2, 4, 5, 5);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
    }
}
