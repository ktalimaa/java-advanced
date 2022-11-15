package org.sda.abstractfactory;

public class FactoryProvider {

    public CarFactory createFactory(String carType) {
        if (carType.equals("Toyota")) {
            return new ToyotaFactory();
        } else if (carType.equals("Lexus")) {
            return new LexusFactory();
        } else throw new RuntimeException("Unknown Car type, cannot create factory for this");
    }
}
