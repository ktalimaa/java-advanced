package org.sda.concurrency;

import lombok.AllArgsConstructor;

/**
 * A stop watch concurrent thread example.
 *
 * @author Kristel Talimaa
 */

@AllArgsConstructor
public class StopWatchThread extends Thread {       // reason for extends is that there is always main thread running. this will run in separate thread
// Thread is a class

    private String prefix;


    @Override
    public void run() {        // overwriting run       // stop watch is running in main its own way
        for (int i = 0; i < 10; i++) {
            System.out.println(prefix + ": " + i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getLocalizedMessage());
            }
        }
    }
}
