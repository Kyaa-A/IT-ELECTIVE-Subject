package Vehicles_Abstract;

public class Plane extends Vehicle {
    private int wings;

    public Plane(String name, int speed, int wings) {
        super(name, speed);
        this.wings = wings;
    }

    public String move() {
        return "The plane is flying.";
    }

    public int getWings() {
        return wings;
    }
}
