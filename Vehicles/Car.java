package Vehicles;

public class Car extends Vehicle {
    private int wheels;

    public Car(String name, int speed, int wheels) {
        super(name, speed);
        this.wheels = wheels;
    }

    @Override
    public String move() {
        return "The car is driving.";
    }

    public int getWheels() {
        return wheels;
    }
}
