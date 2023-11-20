package Vehicles_Abstract;

public class Car extends Vehicle {
    int wheels;

    Car(String name, int speed, int wheels) {
        super(name, speed);
        this.wheels = wheels;
    }

    String move() {
        return "The car is driving.";
    }

    int getWheels() {
        return wheels;
    }
}
