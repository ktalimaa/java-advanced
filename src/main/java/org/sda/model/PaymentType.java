package org.sda.model;

/**
 * List of PaymentType
 *
 * @author Kristel Talimaa
 */

// all enums are in capital letter, if two words X_X, use down stripe
public enum PaymentType {
    CARD (1),
    CASH (2),
    BANK_TRANSFER (3),
    MOBILE_BANKING (4),
    BANK_LINK (5);

    private int value;
    PaymentType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
