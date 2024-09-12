package org.example.classes;

import org.example.exceptions.*;
import java.util.function.*;

public class PhoneLambdaTask {

    public static void runLambdaExamples() throws CameraResolutionException, InsufficientBatteryCapacityException, InvalidScreenSizeException, InvalidProcessorException, StorageLimitExceededException {

        Phone phone1 = new Phone("Samsung", "Galaxy S21", "SN123456789",
                new Screen("1080x2400", 6.7, "OLED"),
                new Battery(4500, "Lithium-ion", 500),
                new Camera(64, true),
                new Processor("Snapdragon 888", 8),
                "Android", 128);

        Phone phone2 = new Phone("Apple", "iPhone 13", "SN987654321",
                new Screen("1170x2532", 6.1, "OLED"),
                new Battery(3240, "Lithium-ion", 500),
                new Camera(12, true),
                new Processor("A15 Bionic", 6),
                "iOS", 256);

        // 1. Function<T, R> - Returning a phone model
        Function<Phone, String> getPhoneModel = Phone::getModel;
        System.out.println("Phone model: " + getPhoneModel.apply(phone1));

        // 2. Consumer<T> - charging the phone
        Consumer<Phone> chargePhone = Phone::charge;
        chargePhone.accept(phone1);

        // 3. Supplier<T> - Creating a new phone object
        Supplier<Phone> phoneSupplier = () -> {
            try {
                return new Phone("OnePlus", "9 Pro", "SN987654321",
                        new Screen("1440x3200", 6.7, "Fluid AMOLED"),
                        new Battery(4500, "Lithium-ion", 500),
                        new Camera(48, true),
                        new Processor("Snapdragon 888", 8),
                        "Android", 128);
            } catch (InvalidScreenSizeException e) {
                throw new RuntimeException(e);
            } catch (InsufficientBatteryCapacityException e) {
                throw new RuntimeException(e);
            } catch (InvalidProcessorException e) {
                throw new RuntimeException(e);
            } catch (CameraResolutionException e) {
                throw new RuntimeException(e);
            } catch (StorageLimitExceededException e) {
                throw new RuntimeException(e);
            }
        };

        Phone newPhone = phoneSupplier.get();
        System.out.println("New phone created: " + newPhone.getModel());

        // 4. Predicate<T> - checks if a phone's storage capacity is greater than 128GB
        Predicate<Phone> isLargeStorage = p -> p.getStorageCapacity() > 128;
        System.out.println("Phone has large storage: " + isLargeStorage.test(phone1));
        System.out.println("Phone has large storage: " + isLargeStorage.test(phone2));

        // 5. BiFunction<T, U, R> - compares two phones by their battery
        BiFunction<Phone, Phone, Boolean> compareBattery = (p1, p2) -> p1.getBattery().getCapacity() > p2.getBattery().getCapacity();
        System.out.println("Phone 1 has larger battery: " + compareBattery.apply(phone1, phone2));
    }
}

