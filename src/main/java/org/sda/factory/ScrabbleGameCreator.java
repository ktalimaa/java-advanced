package org.sda.factory;

public class ScrabbleGameCreator implements GameFactory {

    @Override
    public Game create() {
        return new BoardGame("Scrabble", "Family Game", 4);
    }
}
