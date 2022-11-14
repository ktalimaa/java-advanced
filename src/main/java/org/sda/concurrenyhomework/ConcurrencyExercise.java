package org.sda.concurrenyhomework;

import org.sda.concurrency.StopWatchRunnableImpl;

/**
 * Create a class implementing the Runnable interface (implementing the run method):
 * a) Inside the run method display "Hello!"
 * b) Create a class object
 * c) Start the thread receiving the created object as a parameter (new Thread (<object>).start())
 * d) Create several objects, run separate thread for each of them
 * e) Add the constructor to the created class, that accepts the int value.
 * f) For the displayed data inside the run method, add the received value (Hello + value)
 * g) Add a method to the class that will modify the int value.
 * h) Add a while loop to the run method, inside which it will print the modified int value every few seconds
 * i) Add the ability to disable (gracefully shutdown) the thread. Why shouldn't we just "kill" the thread?
 *
 * @author Kristel Talimaa
 */

public class ConcurrencyExercise {

    String value = "SDA Java course!";

    public static void main(String[] args) {

        // a) Inside the run method display "Hello!"
        System.out.println("Runnable 'Hello!' started...");
        Thread implForHomework = new Thread(new ImplForHomework());
        implForHomework.start();

        // b) Create a class object
        ConcurrencyExercise object = new ConcurrencyExercise();
        System.out.println(object.value);

        // c) Start the thread receiving the created object as a parameter (new Thread (<object>).start())




    }
}