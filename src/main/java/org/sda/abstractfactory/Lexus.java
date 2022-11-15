package org.sda.abstractfactory;

public abstract class Lexus extends AbstractCar {    // has to be abstract method, add abstract

    @Override
    public String getModelName() {
        return "Comfort";
    }

    @Override
    public String getProducer() {
        return "Lexus";
    }

}
