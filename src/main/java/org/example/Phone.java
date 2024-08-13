package org.example;

public class Phone extends Device {
    protected Screen screen;
    protected Battery battery;
    protected Camera camera;
    protected Processor processor;

    public Phone(String brand, String model, Screen screen, Battery battery, Camera camera, Processor processor) {
        super(brand, model);
        this.screen = screen;
        this.battery = battery;
        this.camera = camera;
        this.processor = processor;
    }

    @Override
    public String getDeviceDetails() {
        return "Phone{" + "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", screen=" + screen +
                ", battery=" + battery +
                ", camera=" + camera +
                ", processor=" + processor +
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

    @Override
    public String toString() {
        return super.toString() + " - Phone{" + "screen=" + screen + ", battery=" + battery + ", camera=" + camera + ", processor=" + processor + '}';
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + screen.hashCode();
        result = 31 * result + battery.hashCode();
        result = 31 * result + camera.hashCode();
        result = 31 * result + processor.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        Phone phone = (Phone) obj;

        return screen.equals(phone.screen) && battery.equals(phone.battery) && camera.equals(phone.camera) && processor.equals(phone.processor);
    }
}
