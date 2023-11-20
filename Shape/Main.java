package Shape;

public class Main {
    public static void main(String[] args) {
        
        Circle circle = new Circle("Circle", 1);
        Square square = new Square("Square", 4);
        Triangle triangle = new Triangle("Triangle", 3);

        circle.introduce();
        square.introduce();
        triangle.introduce();
    }
}
