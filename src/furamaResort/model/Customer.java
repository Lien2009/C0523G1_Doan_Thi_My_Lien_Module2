package furamaResort.model;

public class Customer extends Person {
    private String type;
    private String address;

    public Customer() {
    }

    public Customer(String id, String name, String dateOfBirth, String gender, String identify, String phoneNumber, String email, String type, String address) {
        super(id, name, dateOfBirth, gender, identify, phoneNumber, email);
        this.type = type;
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInfoCSV() {
        return super.getInfoCsv() + "," + this.type + "," + this.address;
    }

    @Override
    public String toString() {
        return super.toString() +
                "type='" + type + '\'' +
                ", address='" + address + '\'';
    }

}
