package Shape_Polymorphism;

class Triangle extends Shape{
    Triangle(String name, int numOfSides){
        super(name, numOfSides);
    }

    void callName(){
        System.out.println(name);
    }

    void callSide(){
        System.out.println(numOfSides);
    }

    void introduce(){
        System.out.println("Shape: " + name + "\nSide: " + numOfSides + "\n");
    }
}
