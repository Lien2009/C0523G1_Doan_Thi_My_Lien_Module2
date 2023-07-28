package furamaResort.model;

public class Villa extends Facility {
    private String roomStandard;
    private Double poolArea;
    private int floor;

    public Villa() {
    }

    public Villa(String id, String name, Double area, Double cost, int capacity, String rentType, String roomStandard, Double poolArea, int floor) {
        super(id, name, area, cost, capacity, rentType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getInfoCSV() {
        return super.getInfoCSV() + "," + this.roomStandard + "," + this.poolArea + "," + this.floor;
    }

    @Override
    public String toString() {
        return "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", floor=" + floor;
    }
}
