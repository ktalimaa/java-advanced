package org.sda.abstractfactory;

public class ToyotaSedan extends Toyota {

    @Override
    public String getType() {
        return "Sedan";
    }

    @Override
    public int getNumberOfCylinders() {
        return 4;
    }

    @Override
    public float getEngineVolume() {
        return 1.5f;
    }

    @Override
    public int getTrunkSize() {
        return 450;
    }

}
