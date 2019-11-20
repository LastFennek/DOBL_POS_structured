package Decorator;

public class EcoDeco extends CarDecorator{


    public EcoDeco(Car c){
        super(c);
    }

    @Override
    public int getPrice(){
        return super.getPrice() + -5;
    }
}
