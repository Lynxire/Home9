package task1;

public class Tigger extends Animal {
    @Override
    public void voice() {
        System.out.println("GRRR");
    }

    @Override
    public void eat(String food) {
        if (food == "Meat") {
            System.out.println("nice food");
        } else {
            System.out.println("fee");
        }
    }
}
