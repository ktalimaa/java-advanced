package org.sda.abstractfactory;

public class LexusSedan extends Lexus {

    @Override
    public String getType() {
        return "Sedan";
    }

    @Override
    public int getNumberOfCylinders() {
        return 2;
    }

    @Override
    public float getEngineVolume() {
        return 1.5f;
    }

    @Override
    public int getTrunkSize() {
        return 300;
    }
}
