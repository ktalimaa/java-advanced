package org.sda.factory;

public interface Game {
    String getName();

    String getType();

    int getMinNumberOfPlayers();

    int getMaxNumberOfPlayers();

    boolean canBePlayedRemotely();

}
