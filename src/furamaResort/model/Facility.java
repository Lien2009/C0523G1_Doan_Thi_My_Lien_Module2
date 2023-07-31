package furamaResort.model;

import java.util.Objects;

public class Facility {
    private String id;
    private String name;
    private double area;
    private double cost;
    private int capacity;
    private String rentType;

    public Facility() {
    }

    public Facility(String id) {
        this.id = id;
    }

    public Facility(String id, String name, double area, double cost, int capacity, String rentType) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.capacity = capacity;
        this.rentType = rentType;
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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public String getInfoCSV() {
        return this.id + "," + this.name + "," + this.area + "," + this.cost + "," + this.capacity + "," + this.rentType;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", capacity=" + capacity +
                ", rentType='" + rentType + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Objects.equals(id, facility.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
