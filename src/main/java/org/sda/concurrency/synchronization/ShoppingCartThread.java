package org.sda.concurrency.synchronization;

import lombok.AllArgsConstructor;

/**
 * A thread for shopping cart.
 *
 * @author Kristel Talimaa
 */
@AllArgsConstructor
public class ShoppingCartThread extends Thread {
    private ShoppingCart shoppingCart;

    @Override
    public void run() {
        shoppingCart.addProduct(100);
        shoppingCart.removeProduct(20);
    }
}
