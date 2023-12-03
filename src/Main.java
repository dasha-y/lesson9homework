import num1.Animal;
import num1.Dog;
import num1.NewDog;
import num1.Rabbit;

public class Main {
    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit();
        rabbit.eat("Grass");
        rabbit.eat("Meat");
        rabbit.voice();

        NewDog.makeDogBark();
        NewDog.feedDog("Meat");

    }
}