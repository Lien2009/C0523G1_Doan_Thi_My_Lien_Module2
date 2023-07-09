package ss5.practice.practice1;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();//gọi phương thức được vì default dùng trong cùng package,không cần tạo đối tượng vì có static
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");
        s1.display();//vì phương thức display noStatic nên tạo đối tượng rồi mới gọi
        s2.display();
        s3.display();
    }
}
