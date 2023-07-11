package ss4.exercise;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

public class Fan {
    final int SLOW = 1;//khai báo hằng dùng final + kiểu DL + tên biến = gtri
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;//trường là thuộc tính
    private double radius;
    private String color;
    private boolean status;

    public Fan() {//constructor mặc định
        this(1, 5, "blue", false);//chế độ mặc định của quạt, gọi constructor
    }

    public Fan(int speed, int radius, String color, boolean status) {//constructor có tham số
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.status = status;
    }

    public boolean getStatus() {//get: lấy thuộc tính
        return this.status;
    }

    public boolean setStatus(boolean status) {//set: thay đổi thuộc tính
        return this.status = status;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int setSpeed(int speed) {
        return this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {//phương thức
        if (this.status == true) {
            String stringSpeed = "";//chuyển đổi in ra tốc độ từ số thành chữ
            switch (this.speed) {
                case SLOW:
                    stringSpeed = "SLOW";
                    break;
                case MEDIUM:
                    stringSpeed = "MEDIUM";
                    break;
                case FAST:
                    stringSpeed = "FAST";
                    break;
            }
            return "fan is on: " + "speed: " + stringSpeed + " color: " + this.color + " radius: " + this.radius;
        } else {
            return "Quạt tắt";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(3, 10, "yellow", true);//tạo đối tượng gọi constructor
        Fan fan2 = new Fan(2, 5, "blue", false);
        Fan fan3 = new Fan();
        System.out.println("Fan1: " + fan1.toString());
        System.out.println("Fan2: " + fan2.toString());
        fan2.setStatus(true);//bật fan2
        System.out.println("Fan2: " + fan2.toString());
        System.out.println("Fan3: " + fan3.toString());
        fan3.setStatus(true);
        System.out.println("Fan3: " + fan3.toString());
        fan3.setSpeed(2);
        System.out.println("Fan3: " + fan3.getSpeed());
    }
}

