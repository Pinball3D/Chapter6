package net.smileyzone;

public class Vehicle {
    private String owner;
    private String manufacturer;
    public Vehicle() {
        owner = "";
        manufacturer = "";

    }

    public Vehicle(String owner, String manufacturer) {
        this.owner = owner;
        this.manufacturer = manufacturer;

    }
    public String toString() {
        return "Owner: "+owner+"\nManufacturer: "+manufacturer+"\n";
    }
    public boolean truth(Vehicle other) {
        return owner.equals(other.getOwner()) && manufacturer.equals(other.getManufacturer());
    }

    public void reset(String owner, String manufacturer) {
        this.owner = owner;
        this.manufacturer = manufacturer;
    }

    public String getOwner() { return owner; }
    public String getManufacturer() { return manufacturer; }
}
