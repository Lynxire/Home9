package task1;

public class Dog extends Animal{
    @Override
    public void voice() {
        System.out.println("Gav");
    }

    @Override
    public void eat(String food) {
        if(food == "Meat"){
            System.out.println("nice food");
        }
        else{
            System.out.println("fee");
        }

    }
}
