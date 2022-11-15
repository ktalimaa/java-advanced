package org.sda.abstractfactory;

public interface Car {      // other classes are build on top of this
    String getType();
    String getModelName();
    int getNumberOfCylinders();
    String getProducer();
    float getEngineVolume();
    int getTrunkSize();


}
