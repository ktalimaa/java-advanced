package org.sda.concurrency;

/**
 * Implementation of Runnable interface
 *
 * @author Kristel Talimaa
 */
public class StopWatchRunnableImpl implements Runnable {        // instead thread, implementing Runnable directly
// Runnable is an interface

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Stop watch: " + i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getLocalizedMessage());
            }
        }
    }
}
