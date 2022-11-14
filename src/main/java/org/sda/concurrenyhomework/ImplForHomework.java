package org.sda.concurrenyhomework;

/**
 * Creating a class to implement the Runnable interface.
 *
 * @author Kristel Talimaa
 */

public class ImplForHomework implements Runnable {

    // a) Inside the run method display "Hello!"
    @Override
    public void run() {
        for (int i = 0; i <= 3; i++) {
            System.out.println("Hello! " + i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getLocalizedMessage());
            }
        }
    }
}
