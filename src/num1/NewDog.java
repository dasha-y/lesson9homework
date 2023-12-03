package num1;

public class NewDog {

        public static void makeDogBark() {
            Dog dog = Dog.createDog();
            dog.voice();
        }

        public static void feedDog(String food) {
            Dog dog = Dog.createDog();
            dog.eat(food);
        }


}
