package Shape_Polymorphism;

public class Main {
    public static void main(String[] args) {
        
        Shape circle = new Circle("Circle", 1);
        Shape square = new Square("Square", 4);
        Shape triangle = new Triangle("Triangle", 3);

        circle.introduce();
        square.introduce();
        triangle.introduce();
    }
}
