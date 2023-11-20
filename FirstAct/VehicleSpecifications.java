import java.util.ArrayList;
import java.util.List;

public class VehicleSpecifications {
    private static final List<Vehicle> vehicles = new ArrayList<>();

    static {
        vehicles.add(new Vehicle("Mazda CX-5", "Red", 1712, "Manual"));
        vehicles.add(new Vehicle("Toyota RAV4", "White", 1695, "Automatic"));
        vehicles.add(new Vehicle("Honda CR-V", "Black", 1700, "CVT"));
        vehicles.add(new Vehicle("Subaru Forester", "Blue", 1765, "CVT"));
        vehicles.add(new Vehicle("Mitsubishi Outlander", "Silver", 1785, "CVT"));
    }

    public static List<Vehicle> getVehicles() {
        return vehicles;
    }
}
