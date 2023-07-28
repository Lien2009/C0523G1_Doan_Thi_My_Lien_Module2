package furamaResort.model;

public class House extends Facility {
    private String roomStandard;
    private int floor;

    public House() {
    }

    public House(String id, String name, Double area, Double cost, int capacity, String rentType, String roomStandard, int floor) {
        super(id, name, area, cost, capacity, rentType);
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getInfoCSV() {
        return super.getInfoCSV() + "," + this.roomStandard + "," + this.floor;
    }

    @Override
    public String toString() {
        return "roomStandard='" + roomStandard + '\'' +
                ", floor=" + floor;
    }
}
