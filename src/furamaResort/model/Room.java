package furamaResort.model;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String id, String name, Double area, Double cost, int capacity, String rentType, String freeService) {
        super(id, name, area, cost, capacity, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public String getInfoCSV() {
        return super.getInfoCSV() + "," + this.freeService;
    }

    @Override
    public String toString() {
        return "freeService='" + freeService + '\'';
    }
}
