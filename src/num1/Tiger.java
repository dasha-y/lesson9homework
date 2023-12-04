package num1;

public class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("Tiger scream");
    }

    @Override
    public void eat(Food food) {
        if (food==Food.MEAT) {
            System.out.println("Тигор любит есть мясо");
        } else {
            System.out.println("Тигор недоволен");
        }
    }
}