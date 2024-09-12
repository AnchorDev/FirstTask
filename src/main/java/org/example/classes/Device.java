package org.example.classes;

public abstract class Device {
    protected String brand;
    protected String model;

    private String serialNumber;

    public Device(String brand, String model, String serialNumber) {
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public abstract String getDeviceDetails();

    @Override
    public String toString() {
        return "Device{" + "brand='" + brand + '\'' + ", model='" + model + '\'' + ", serialNumber='" + serialNumber + '\'' + '}';
    }

    @Override
    public int hashCode() {
        int result = brand.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + serialNumber.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Device device = (Device) obj;
        return brand.equals(device.brand) && model.equals(device.model) && serialNumber.equals(device.serialNumber);
    }
}
