package org.example.Enums;

public enum PhoneSize {
    SMALL(5.0), MEDIUM(6.0), LARGE(7.0);

    private final double inches;

    PhoneSize(double inches) {
        this.inches = inches;
    }

    public double getInches() {
        return inches;
    }

    @Override
    public String toString() {
        return "Phone size: " + inches + " inches";
    }
}

