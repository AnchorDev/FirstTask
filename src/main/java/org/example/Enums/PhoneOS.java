package org.example.Enums;

public enum PhoneOS {
    ANDROID("Google-based"),
    IOS("Apple-based"),
    WINDOWS_PHONE("Microsoft-based");

    private final String description;

    PhoneOS(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name() + ": " + description;
    }
}

