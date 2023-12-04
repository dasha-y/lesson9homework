package num1;

public class Dog extends Animal{
    private Dog() {
    }

    @Override
    public void voice() {
        System.out.println("Dog scream");
    }

    @Override
    public void eat(Food food) {
        if(food==Food.MEAT){
            System.out.println("Собака любит есть мясо");
        } else {
            System.out.println("Собака недовольна");
        }

    }
    public static Dog createDog() {
        return new Dog();
    }

}
