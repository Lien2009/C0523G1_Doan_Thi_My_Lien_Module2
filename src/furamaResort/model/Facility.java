package furamaResort.model;

public abstract class Facility {
    private String id;
    private String name;
    private Double area;
    private Double cost;
    private int capacity;
    private String rentType;

    public Facility() {
    }

    public Facility(String id, String name, Double area, Double cost, int capacity, String rentType) {
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

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
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
}
