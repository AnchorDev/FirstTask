package org.example;

public interface Connectable {
    void connectToWiFi(String network);

    default void showConnectionStatus() {
        System.out.println("Connected to the network.");
    }
}
