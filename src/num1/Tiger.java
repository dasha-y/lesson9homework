package num1;

public class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("Tiger scream");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("Тигор любит есть мясо");
        } else {
            System.out.println("Тигор недоволен");
        }
    }
}