package org.example;
import org.example.exceptions.*;

public class Phone extends Device implements Chargeable, Connectable, Upgradable, WaterResistant, Repairable {
    protected Screen screen;
    protected Battery battery;
    protected Camera camera;
    protected Processor processor;
    private String operatingSystem;
    private final int storageCapacity;
    private final String serialNumber;
    private static int totalPhonesCreated;


    static {
        totalPhonesCreated = 0;
        System.out.println("Static block executed. Total phones created: " + totalPhonesCreated);
    }

    public Phone(String brand, String model, String serialNumber, Screen screen, Battery battery, Camera camera, Processor processor, String operatingSystem, int storageCapacity)
            throws InvalidScreenSizeException, InsufficientBatteryCapacityException, InvalidProcessorException, CameraResolutionException, StorageLimitExceededException {
        super(brand, model, serialNumber);

        if (screen.getSize() <= 0) {
            throw new InvalidScreenSizeException("Screen size must be greater than 0");
        }

        if (battery.getCapacity() < 1000) {
            throw new InsufficientBatteryCapacityException("Battery capacity must be at least 1000mAh");
        }

        if (processor.getCores() < 1) {
            throw new InvalidProcessorException("Processor must have at least 1 core");
        }

        if (camera.getMegapixels() < 12) {
            throw new CameraResolutionException("Camera resolution must be at least 12MP");
        }

        if (storageCapacity > 512) {
            throw new StorageLimitExceededException("Storage capacity exceeds limit of 512GB");
        }

        this.screen = screen;
        this.battery = battery;
        this.camera = camera;
        this.processor = processor;
        this.operatingSystem = operatingSystem;
        this.storageCapacity = storageCapacity;
        this.serialNumber = serialNumber;
        totalPhonesCreated++;
    }

    public final void displayPhoneDetails() {
        System.out.println(getDeviceDetails());
    }

    public static int getTotalPhonesCreated() {
        return totalPhonesCreated;
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

    @Override
    public void charge() {
        System.out.println("Charging the phone...");
    }

    @Override
    public void connectToWiFi(String network) {
        System.out.println("Connecting to WiFi network: " + network);
    }

    @Override
    public void upgradeSystem() {
        System.out.println("Upgrading the operating system...");
    }

    @Override
    public void checkWaterResistance() {
        System.out.println("Checking water resistance of the phone...");
    }

    @Override
    public void repair() {
        System.out.println("Repairing the phone...");
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
