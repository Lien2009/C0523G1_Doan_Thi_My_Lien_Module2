package ss9_mvc.practice.model;

public class Customer implements Comparable<Customer> {
    private int id;
    private String name;
    private int age;
    private String typeCustomer;

    public Customer() {
    }

    public Customer(int id, String name, int age, String typeCustomer) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.typeCustomer = typeCustomer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", typeCustomer='" + typeCustomer + '\'' +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        if (this.getAge()>o.getAge()){
            return 1;
        }else if (this.getAge()<o.getAge()){
            return -1;
        }else {
            return this.getName().compareTo(o.getName());
        }
    }
}
