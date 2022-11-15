package org.sda.abstractfactory;

public abstract class AbstractCar implements Car {

    // toString method for abstract class
    @Override
    public String toString() {
        return "Car: " + getProducer() + " " + getModelName() + " " + getType()
                + " has " + getNumberOfCylinders() + " cylinders and engine " + getEngineVolume()
                + " and a trunk with size " + getTrunkSize() + " litres";
    }
}
