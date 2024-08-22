package org.example;

public interface Chargeable {
    void charge();

    default void showChargingStatus() {
        System.out.println("Charging in progress...");
    }
}
