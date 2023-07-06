package ss4.exercise;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed = SLOW;
    int radius = 5;
    String color = "blue";
    boolean status = false;
    public Fan(){
    }
    public Fan(int speed, int radius, String color, boolean status) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.status = status;
    }

    private boolean getStatus(){
       return this.status;
    }
    private boolean setStatus(boolean status){
        return this.status = status;
    }
    private int getSpeed(){
        return this.speed;
    }
    private int setSpeed(int speed){
        if (speed == 1){
            return this.speed = SLOW;
        } else if (speed == 2){
            return this.speed = MEDIUM;
        } else {
            return this.speed = FAST;
        }
    }
    private double getRadius(){
        return this.radius;
    }
    private String getColor(){
        return this.color;
    }
    public String toString() {
        if (this.status == true) {
            return "fan is on: " + "speed: " + this.speed + " color: " + this.color + " radius: " + this.radius;
        } else {
            return "Quạt tắt";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(3,10,"yellow",true);
        Fan fan2 = new Fan(2,5,"blue",false);
        Fan fan3 = new Fan();
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        fan2.setStatus(true);
        System.out.println(fan2.toString());
        System.out.println(fan3.toString());
        fan3.setStatus(true);
        System.out.println(fan3.toString());
        fan3.setSpeed(2);
        System.out.println(fan3.getSpeed());
    }

}

