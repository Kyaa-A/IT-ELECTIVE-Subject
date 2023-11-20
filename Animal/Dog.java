package Animal;

public class Dog extends Animal {
    
    String animal = "Dog";
    String eat;
    Dog(String type, String sound, String eat){
        super(type, sound);
        this.eat = eat;
    }

    void status(){
        System.out.println("Animal: " + animal);
        System.out.println("Type: " + type);
        System.out.println("Sound: " + sound);
        System.out.println("Eat: " + eat);
    }
}


