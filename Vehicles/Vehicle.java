package Vehicles;

public abstract class Vehicle {
    protected String name;
    protected int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public abstract String move();

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
}
