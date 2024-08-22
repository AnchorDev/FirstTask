package org.example;

public interface Upgradable {
    void upgradeSystem();

    default void checkForUpdates() {
        System.out.println("Checking for system updates...");
    }
}
