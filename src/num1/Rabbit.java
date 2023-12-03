package num1;

public class Rabbit extends Animal{
    @Override
    public void voice() {
        System.out.println("Rabbit scream");
    }

    @Override
    public void eat(String food) {

        if(food.equals("Grass")){
            System.out.println("Кролик любит есть травку");
        } else {
            System.out.println("Кролик недоволен");
        }
    }
}
