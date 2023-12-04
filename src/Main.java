import num1.*;

public class Main {
    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit();
        rabbit.eat(Food.GRASS);
        rabbit.eat(Food.MEAT);
        rabbit.voice();

        NewDog.makeDogBark();
        NewDog.feedDog(Food.MEAT);

    }
}