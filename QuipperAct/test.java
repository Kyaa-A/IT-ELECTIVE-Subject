package QuipperAct;
public class test {
    public static void main(String[] args) {
        // Physical Objects
        Room room101 = new Room("101", "Single", 100.00, true, 2);
        Room room202 = new Room("202", "Double", 150.00, true, 4);
        Guest guest1 = new Guest("John Doe", "johndoe@email.com");
        Staff staff1 = new Staff("Alice Smith", "Front Desk");

        // Conceptual Objects
        Reservation reservation1 = new Reservation(guest1, room101, "2023-11-01", "2023-11-05");
        Invoice invoice1 = new Invoice(guest1, room101, "2023-11-01", "2023-11-05");

        // Display information
        room101.displayInfo();
        room202.displayInfo();
        guest1.displayInfo();
        staff1.displayInfo();
        reservation1.displayInfo();
        invoice1.displayInfo();
    }
}

class Room {
    String number;
    String type;
    double price;
    boolean isAvailable;
    int capacity;

    public Room(String number, String type, double price, boolean isAvailable, int capacity) {
        this.number = number;
        this.type = type;
        this.price = price;
        this.isAvailable = isAvailable;
        this.capacity = capacity;
    }

    public void displayInfo() {
        System.out.println("Room Number: " + number);
        System.out.println("Room Type: " + type);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Occupied"));
        System.out.println("Capacity: " + capacity + " guests");
        System.out.println();
    }
}

class Guest {
    String name;
    String email;

    public Guest(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void displayInfo() {
        System.out.println("Guest Name: " + name);
        System.out.println("Guest Email: " + email);
        System.out.println();
    }
}

class Staff {
    String name;
    String position;

    public Staff(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void displayInfo() {
        System.out.println("Staff Name: " + name);
        System.out.println("Position: " + position);
        System.out.println();
    }
}

class Reservation {
    Guest guest;
    Room room;
    String checkInDate;
    String checkOutDate;

    public Reservation(Guest guest, Room room, String checkInDate, String checkOutDate) {
        this.guest = guest;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public void displayInfo() {
        System.out.println("Reservation Information:");
        guest.displayInfo();
        room.displayInfo();
        System.out.println("Check-in Date: " + checkInDate);
        System.out.println("Check-out Date: " + checkOutDate);
        System.out.println();
    }
}

class Invoice {
    Guest guest;
    Room room;
    String checkInDate;
    String checkOutDate;

    public Invoice(Guest guest, Room room, String checkInDate, String checkOutDate) {
        this.guest = guest;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public void displayInfo() {
        System.out.println("Invoice Information:");
        guest.displayInfo();
        room.displayInfo();
        System.out.println("Check-in Date: " + checkInDate);
        System.out.println("Check-out Date: " + checkOutDate);
        System.out.println("Total Amount: $" + (room.price * calculateStayDuration(checkInDate, checkOutDate)));
        System.out.println();
    }

    private int calculateStayDuration(String checkInDate, String checkOutDate) {
        // You can implement date calculations here
        // For simplicity, we'll assume each night costs one day
        return 1; // Replace with actual calculation
    }
}
