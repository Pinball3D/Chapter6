package net.smileyzone;

public class Truck extends Vehicle {
    private int cylinders;
    private double load;
    private double tow;

    public Truck() {
        cylinders = 0;
        load = 0;
        tow = 0;
    }
    public Truck(String owner, String manufacturer, int cylinders, double load, double tow) {
        super(owner, manufacturer);
        this.cylinders = cylinders; this.load = load; this.tow = tow;
    }
    public void reset(int cylinders, double load, double tow) {
        this.cylinders = cylinders; this.load = load; this.tow = tow;
    }

    public String toString() {
        return super.toString()+"Cylinders: "+cylinders+"\nLoad Capacity: "+load+"\nTow Capacity: "+tow;
    }
    public String toString(Truck other) {
        return this.toString()+"\n\n"+compare(other)+"\n\n"+other;
    }
    public String compare(Truck other) {
        return (getOwner().equals(other.getOwner()) && getManufacturer().equals(other.getManufacturer()) &&
                load == other.getLoad() && cylinders == other.getCylinders() && tow == other.getTow()) ? "Is the same truck as" : "Is not the same truck as";
    }

    public int getCylinders() {return cylinders;}
    public double getLoad() {return load;}
    public double getTow() {return tow;}
}
