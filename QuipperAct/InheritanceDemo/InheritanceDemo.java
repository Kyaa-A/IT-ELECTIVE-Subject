package InheritanceDemo;

public class InheritanceDemo {

  public static void main(String[] args) {

    Vehicle vehicle = new Vehicle("BMW", 2021);
    Car car = new Car("Mitsubishi", 2022, 4);

    vehicle.start();
    vehicle.stop();

    System.out.println();

    car.start();
    car.stop();
  }
}
  