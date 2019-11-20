package Decorator;

public class Hm {
    public static void main(String[] args) {
        Car c1 = new EcoDeco(new SportDeco(new BasicCar()));

        System.out.println(c1.getPrice());
    }
}
