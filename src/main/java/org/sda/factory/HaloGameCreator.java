package org.sda.factory;

public class HaloGameCreator implements GameFactory {

    @Override
    public Game create() {
        return new PCGame("Halo", "FPS", 1, 4, true);
    }
}
