package org.example;

public class Phone extends Device {
    private Screen screen;
    private Battery battery;
    private Camera camera;
    private Processor processor;

    public Phone(String brand, String model, Screen screen, Battery battery, Camera camera, Processor processor) {
        super(brand, model);
        this.screen = screen;
        this.battery = battery;
        this.camera = camera;
        this.processor = processor;
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
}
