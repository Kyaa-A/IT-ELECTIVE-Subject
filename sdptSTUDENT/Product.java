package sdptSTUDENT;

public class Product {
    String productName;
    float productPrice;

    Product(String productName, float productPrice){
        this.productName = productName;
        this.productPrice = productPrice;

        System.out.println(productName + " is created.");
        System.out.println("PHP " + productPrice);
    }   
}
