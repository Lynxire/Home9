package task2;

import task1.Animal;

public class Dogi extends Animal {
    private Dogi(){
    }


    @Override
    public void voice() {
        System.out.println("Gav");
    }

    @Override
    public void eat(String food) {
        System.out.println("nice " + food);
    }

    public static Dogi zozo(){
        return new Dogi();
    }
}
