package sdptSTUDENT;

import java.util.Scanner;

public class MakeObject {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        //Person Created
        
        /* Person person = new Person("Asnari Pacalna", "Sing", 20, 'M'); */

        //Product Created
        
        System.out.print("Product Name: ");
        String productName = scan.nextLine();
        
        System.out.print("Product Price: ");
        int productPrice = scan.nextInt();
        
        Product product = new Product(productName, productPrice);

        //Student Created

        Student student = new Student("Asnari", "Pacalna", "2nd year", "BSIT", "Afternoon", 98, 100);
        student.introduceSelf();
        student.evaluateGrade();
    }
}
