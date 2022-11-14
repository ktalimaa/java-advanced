package org.sda.singleton;

/**
 * Two ways to create a singleton.
 *
 * @author Kristel Talimaa
 */

// Singleton class
public class Counter {

    // Eager singleton using class implementation
    // This type of singleton is crated on startup
    private static final Counter INSTANCE = new Counter();      // all caps bc its final. it's like Enum // Enum allows access directly
    private int count = 0;  // Holds the value of what the current count is

    // This constructor overrides the default public constructor
    // By doing this, classes outside will be unable to just create instances of this class
    private Counter() {

    }

    // Increase the counter
    public void increment() {       // every calling of the increment method adds +1
        count++;
    }

    // getter for count
    public int getCount() {
        return count;
    }

    // getter for the singleton
    public static Counter getInstance() {
        return INSTANCE;
    }

    // all above is for creating singleton





}
