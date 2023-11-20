package Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userInput;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number from 1 to 5 to display: ");
        userInput = scan.nextInt();

        if (userInput < 1 || userInput > 5) {
            System.out.println("Invalid input!");
            return;
        }

        Vehicle vehicle = Second.getVehicles().get(userInput - 1);

        System.out.println("\n" + "=".repeat(38) + "");
        System.out.println("Vehicle Name: " + vehicle.name);
        System.out.println("Color: " + vehicle.color);
        System.out.println("Weight: " + vehicle.weight);
        System.out.println("Transmission: " + vehicle.transmission);
        System.out.println("=".repeat(38) + "\n");
    }
}
