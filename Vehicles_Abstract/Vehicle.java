package Vehicles_Abstract;

public abstract class Vehicle {
    String name;
    int speed;

    Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    abstract String move();

    String getName() {
        return name;
    }

    int getSpeed() {
        return speed;
    }
}
