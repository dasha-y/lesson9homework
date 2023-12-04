package num1;

public class NewDog {

        public static void makeDogBark() {
            Dog dog = Dog.createDog();
            dog.voice();
        }

        public static void feedDog(Food food) {
            Dog dog = Dog.createDog();
            dog.eat(food);
        }


}
