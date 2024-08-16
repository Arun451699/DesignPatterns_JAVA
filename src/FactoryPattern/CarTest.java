package FactoryPattern;

public class CarTest {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car CarSuv = factory.getcar("Suv");
        CarSuv.assemble();
        Car CarSedan = factory.getcar("Sedan");
        CarSedan.assemble();
        Car CarMini = factory.getcar("Mini");
        CarMini.assemble();
        Car CarScoda = factory.getcar("Scoda");
        CarScoda.assemble();
    }
}
