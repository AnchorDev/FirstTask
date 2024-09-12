package org.example.Enums;

public enum PhoneCondition {
    NEW, USED, REFURBISHED;

    static {
        System.out.println("PhoneCondition enum initialized.");
    }

    public boolean isNew() {
        return this == NEW;
    }

    public boolean isUsed() {
        return this == USED || this == REFURBISHED;
    }
}
