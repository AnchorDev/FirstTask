package org.example;

public class Battery {
    protected int capacity;
    protected String type;

    private int cycleCount;

    public Battery(int capacity, String type, int cycleCount) {
        this.capacity = capacity;
        this.type = type;
        this.cycleCount = cycleCount;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCycleCount() {
        return cycleCount;
    }

    public void setCycleCount(int cycleCount) {
        this.cycleCount = cycleCount;
    }

    @Override
    public String toString() {
        return "Battery{" + "capacity=" + capacity + ", type='" + type + '\'' + ", cycleCount=" + cycleCount + '}';
    }
}
