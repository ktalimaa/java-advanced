package org.sda.singleton.exercises;

/**
 * Exercise: Create an eager singleton class called Engine
 * It should have a boolean filed called isEngineWorking (turn off engine, turn on engine)
 *
 * @author Kristel Talimaa
 */

public class Engine {
    private static Engine Instance = new Engine();          // making instance final is optional
    private boolean isEngineWorking = false;

    private Engine () {
    }

    public void turnEngineOn() {
        isEngineWorking = true;
    }

    public boolean getEngineState() {   // method outside never will access this method inside
        return isEngineWorking;
    }

    public static Engine getInstance() {
        return Instance;
    }
}