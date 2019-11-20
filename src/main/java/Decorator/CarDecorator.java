package Decorator;

abstract class CarDecorator implements Car{

    public Car c;
    public CarDecorator(Car c){
        this.c = c;
    }

    public int getPrice() {
        return c.getPrice();
    }
}
