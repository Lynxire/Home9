import task1.Dog;
import task1.Rabbit;
import task1.Tigger;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Rabbit rabbit = new Rabbit();
        Tigger tigger = new Tigger();
        dog.voice();
        dog.eat("Meat");
        rabbit.voice();
        rabbit.eat("Grass");
        tigger.voice();
        tigger.eat("Meat");

    }
}