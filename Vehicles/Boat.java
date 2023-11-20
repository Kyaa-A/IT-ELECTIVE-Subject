package Vehicles;

public class Boat extends Vehicle {
    private int propellers;

    public Boat(String name, int speed, int propellers) {
        super(name, speed);
        this.propellers = propellers;
    }

    @Override
    public String move() {
        return "The boat is sailing.";
    }

    public int getPropellers() {
        return propellers;
    }
}
