package ss5.practice.practice1;

public class Student {//bài này có lớp public, thuộc tính private, phương thức default
    private  int rollno;
    private String name;
    private static String college = "BBDIT";//biến tĩnh
    Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
    static void change(){ //phương thức tĩnh dùng cho biến tĩnh
        college = "CODEGYM";
    }
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}

