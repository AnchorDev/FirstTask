package org.example.Interfaces;

public interface WaterResistant {
    void checkWaterResistance();

    default void showWaterResistanceStatus() {
        System.out.println("Device is water-resistant.");
    }
}
