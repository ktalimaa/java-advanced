package org.sda.factory;

public class BoardGame implements Game {     // add implements method
    private String name;
    private String type;
    private int maxPlayerNumber;

    // create constructor
    public BoardGame(String name, String type, int maxPlayerNumber) {
        this.name = name;
        this.type = type;
        this.maxPlayerNumber = maxPlayerNumber;
    }

    // add getters
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getMaxNumberOfPlayers() {        // changed
        return maxPlayerNumber;
    }

    @Override
    public int getMinNumberOfPlayers() {
        return 2;
    }

    @Override
    public boolean canBePlayedRemotely() {
        return false;
    }

    @Override
    public String toString() {
        return "BoardGame{ name= " + name + ", type= " + type + ", maxPlayerNumber= " + maxPlayerNumber + " }";
    }


}
