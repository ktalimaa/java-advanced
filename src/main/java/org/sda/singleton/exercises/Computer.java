package org.sda.singleton.exercises;

/**
 * Exercise: Create a lazy double checked singleton called Computer
 * It should have a boolean field called startUp;
 *
 * @author Kristel Talimaa
 */

public class Computer {
    private static Computer instance;             // static bc we don't want to create multiple instances at once
    private static boolean startUp = false;

    // make constructor
    private Computer() {
    }

    // method to interact computer
    public void turnOnComputer() {
        startUp = true;     // system outside won't see the field, bc it's private above
    }

    public boolean getComputerState() {
        return startUp;
    }

    // double checked
    public static Computer getInstance() {
        if (instance == null) {
            synchronized (Computer.class) {
                if (instance == null) {
                    instance = new Computer();
                }
            }
        }
        return instance;
    }
}
