package org.sda.abstractfactory;

public class ToyotaCombi extends Toyota {       // this is not an abstract class

    @Override
    public String getType() {
        return "Combi";
    }

    @Override
    public int getNumberOfCylinders() {
        return 3;
    }

    @Override
    public float getEngineVolume() {
        return 2.5f;
    }

    @Override
    public int getTrunkSize() {
        return 600;
    }

}
