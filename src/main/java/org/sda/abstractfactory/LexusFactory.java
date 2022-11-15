package org.sda.abstractfactory;

public class LexusFactory implements CarFactory {

    @Override
    public Car createSedan() {
        return new LexusSedan();
    }

    @Override
    public Car createCombi() {
        return new LexusCombi();
    }
}
