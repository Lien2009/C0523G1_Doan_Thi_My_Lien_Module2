package furamaResort.model;

public class Villa extends Facility {
    private String villaStandard;
    private Double poolArea;
    private int floor;

    public Villa() {
    }

    public Villa(String id, String name, Double area, Double cost, int capacity, String rentType, String roomStandard, Double poolArea, int floor) {
        super(id, name, area, cost, capacity, rentType);
        this.villaStandard = roomStandard;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getVillaStandard() {
        return villaStandard;
    }

    public void setVillaStandard(String villaStandard) {
        this.villaStandard = villaStandard;
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
        return super.getInfoCSV() + "," + this.villaStandard + "," + this.poolArea + "," + this.floor;
    }

    @Override
    public String toString() {
        return super.toString()+","+ "roomStandard='" + villaStandard + '\'' +
                ", poolArea=" + poolArea +
                ", floor=" + floor;
    }
}
