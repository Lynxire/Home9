package task1;

public class Rabbit extends Animal{
    @Override
    public void voice() {
        System.out.println("kuf kuf");
    }

    @Override
    public void eat(String food) {
        if(food == "Grass"){
            System.out.println("nice food");
        }
        else{
            System.out.println("fee");
        }
    }
}
