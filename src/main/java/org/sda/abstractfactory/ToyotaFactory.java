package org.sda.abstractfactory;

public class ToyotaFactory implements CarFactory {

    @Override
    public Car createSedan() {
        return new ToyotaSedan();
    }

    @Override
    public Car createCombi() {
        return new ToyotaCombi();
    }
}
