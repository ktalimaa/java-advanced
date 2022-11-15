package org.sda.abstractfactory;

public class LexusCombi extends Lexus {

    @Override
    public String getType() {
        return "Combi";
    }

    @Override
    public int getNumberOfCylinders() {
        return 5;
    }

    @Override
    public float getEngineVolume() {
        return 2.9f;
    }

    @Override
    public int getTrunkSize() {
        return 560;
    }

}
