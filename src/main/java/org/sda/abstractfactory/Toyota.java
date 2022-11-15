package org.sda.abstractfactory;

public abstract class Toyota extends AbstractCar {      // also an abstract class

    @Override
    public String getModelName() {
        return "Camry";
    }

    @Override
    public String getProducer() {
        return "Toyota";
    }

}
