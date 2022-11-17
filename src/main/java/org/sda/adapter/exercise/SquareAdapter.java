package org.sda.adapter.exercise;

/**
 * Create an adapter that will allow us to use the Rectangle interface to find the width, height and area of the square.
 *
 * @author Kristel Talimaa
 */

public class SquareAdapter implements Rectangle {

    private Square square;

    // constructor
    public SquareAdapter(Square square) {
        this.square = square;
    }

    // implementing methods
    @Override
    public int getWidth() {
        return square.getSideLengthOfTheSquare();
    }

    @Override
    public int getHeight() {
        return square.getSideLengthOfTheSquare();
    }

}
