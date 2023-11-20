package Vehicles_Abstract;

public class Boat extends Vehicle {
    int propellers;

    Boat(String name, int speed, int propellers) {
        super(name, speed);
        this.propellers = propellers;
    }

    String move() {
        return "The boat is sailing.";
    }

    int getPropellers() {
        return propellers;
    }
}
