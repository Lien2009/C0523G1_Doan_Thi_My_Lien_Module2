package furamaResort.model;

public abstract class Person {
    private String id;
    private String name;
    private String dateOfBirth;
    private String gender;
    private String identify;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String id, String name, String dateOfBirth, String gender, String identify, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.identify = identify;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getidentify() {
        return identify;
    }

    public void setidentify(String identify) {
        this.identify = identify;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfoCsv() {
        return this.id + "," + this.name + "," + this.dateOfBirth + "," + this.gender + "," + this.identify + "," + this.phoneNumber + "," + this.email;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", identify=" + identify +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'';
    }
}
