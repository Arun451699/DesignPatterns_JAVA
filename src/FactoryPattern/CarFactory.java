package FactoryPattern;

public class CarFactory {
    public Car getcar(String cartype) {
        if (cartype == null) {
            return null;
        }
        if (cartype.equalsIgnoreCase("Suv")) {
            return new Suv();
        } else if (cartype.equalsIgnoreCase("Sedan")) {
            return new Sedan();
        } else if (cartype.equalsIgnoreCase("mini")) {
            return new Mini();
        }
        return null;
    }
}
