package org.example.Interfaces;

public interface Repairable {
    void repair();

    default void showRepairStatus() {
        System.out.println("Device is under repair.");
    }
}
