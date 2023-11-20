package Vehicles;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Honda Accord", 60, 4);
        Plane plane = new Plane("Boeing 747", 500, 2);
        Boat boat = new Boat("Titanic", 20, 3);

        System.out.println(car.move());
        System.out.println(plane.move());
        System.out.println(boat.move());
    }
}

