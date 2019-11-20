package Decorator;

public class SportDeco extends CarDecorator {


    public SportDeco(Car c){
        super(c);
    }

    @Override
    public int getPrice(){
        return super.getPrice() + 100;
    }


}
