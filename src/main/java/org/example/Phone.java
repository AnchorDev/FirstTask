package org.example;

public class Phone extends Device {
    protected Screen screen;
    protected Battery battery;
    protected Camera camera;
    protected Processor processor;

    private String operatingSystem;
    private int storageCapacity;

    public Phone(String brand, String model, String serialNumber, Screen screen, Battery battery, Camera camera, Processor processor, String operatingSystem, int storageCapacity) {
        super(brand, model, serialNumber);
        this.screen = screen;
        this.battery = battery;
        this.camera = camera;
        this.processor = processor;
        this.operatingSystem = operatingSystem;
        this.storageCapacity = storageCapacity;
    }

    @Override
    public String getDeviceDetails() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", screen=" + screen +
                ", battery=" + battery +
                ", camera=" + camera +
                ", processor=" + processor +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", storageCapacity=" + storageCapacity +
                '}';
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " - Phone{" +
                "screen=" + screen +
                ", battery=" + battery +
                ", camera=" + camera +
                ", processor=" + processor +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", storageCapacity=" + storageCapacity +
                '}';
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + screen.hashCode();
        result = 31 * result + battery.hashCode();
        result = 31 * result + camera.hashCode();
        result = 31 * result + processor.hashCode();
        result = 31 * result + operatingSystem.hashCode();
        result = 31 * result + storageCapacity;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        Phone phone = (Phone) obj;

        return storageCapacity == phone.storageCapacity &&
                operatingSystem.equals(phone.operatingSystem) &&
                screen.equals(phone.screen) &&
                battery.equals(phone.battery) &&
                camera.equals(phone.camera) &&
                processor.equals(phone.processor);
    }
}
