package org.sda.concurrenyhomework;

import lombok.AllArgsConstructor;

/**
 * Thread for homework.
 *
 * @author Kristel Talimaa
 */

@AllArgsConstructor
public class ThreadForHomework extends Thread {

    private String prefix;



    @Override
    public void run() {
        for (int x = 0; x < 5; x++) {
            System.out.println(prefix + ": " + x);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e.getLocalizedMessage());
            }
        }
    }
}
