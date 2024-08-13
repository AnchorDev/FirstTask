package org.example;

public class Battery {
    protected int capacity;
    protected String type;

    public Battery(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
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

    @Override
    public String toString() {
        return "Battery{" + "capacity=" + capacity + ", type='" + type + '\'' + '}';
    }
}
