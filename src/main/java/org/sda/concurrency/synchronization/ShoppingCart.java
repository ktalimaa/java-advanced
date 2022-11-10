package org.sda.concurrency.synchronization;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Synchronization base class
 *
 * @author Kristel Talimaa
 */

@AllArgsConstructor
@Getter
public class ShoppingCart {
    private int numberOfProducts;

    public void addProduct(int quantity) { // with sync only one thread will get access on one time
        System.out.println("Adding product...");

        // Code block sync
        synchronized (this) {
            numberOfProducts += quantity;
        }
    }

    // Method sync
    public synchronized void removeProduct(int quantity) {       // without sync, two threads are targeting at the same time
        System.out.println("Removing product...");
        numberOfProducts -= quantity;
    }
}
