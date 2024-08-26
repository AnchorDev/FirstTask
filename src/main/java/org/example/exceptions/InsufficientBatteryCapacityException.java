package org.example.exceptions;

public class InsufficientBatteryCapacityException extends Exception {
    public InsufficientBatteryCapacityException(String message) {
        super(message);
    }
}
