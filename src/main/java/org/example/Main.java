package org.example;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.example.exceptions.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Task #1
        System.out.println("\n#Task 1");
        if (args.length > 0) {
            System.out.println("\nUser info: " + args[0]);
        } else {
            System.out.println("No user info provided.");
        }

        int[] array = {34, 7, 23, 32, 5, 62, 32, 64, 12, 22, 45, 78, 21, 54, 33, 90, 10, 11, 6, 3, 99, 2, 1, 88, 15, 43, 56, 77, 38, 19, 44, 55, 76, 39, 41, 25, 14, 17, 18, 29, 30, 50, 59, 28, 27, 26, 13, 4, 16, 8};
        System.out.println("\nUnsorted array:");
        Quicksort.printArray(array);

        Quicksort.quickSort(array, 0, array.length - 1);
        System.out.println("\nSorted array:");
        Quicksort.printArray(array);

        // Task #2 and #3
        System.out.println("\n#Task 2 and #3");
        Screen screen = new Screen("1080x2400", 6.7, "OLED");

        Battery battery = new Battery(4500, "Lithium-ion", 500);
        //Battery battery = new Battery(800, "Lithium-ion", 500); //Example of an Exception

        Camera camera = new Camera(64, true);
        //Camera camera = new Camera(8, true); //Example of an Exception

        Processor processor = new Processor("Snapdragon 888", 8);

        try {
            Phone phone = new Phone("Samsung", "Galaxy S21", "SN123456789", screen, battery, camera, processor, "Android", 128);
            Phone phone2 = new Phone("Samsung", "Galaxy S21", "SN123456789", screen, battery, camera, processor, "Android", 128);

            Screen screen3 = new Screen("1440x3200", 6.9, "OLED");
            Battery battery3 = new Battery(5000, "Lithium-ion", 700);
            Camera camera3 = new Camera(108, true);
            Processor processor3 = new Processor("Exynos 2100", 8);

            Phone phone3 = new Phone("Samsung", "Galaxy S21 Ultra", "SN987654321", screen3, battery3, camera3, processor3, "Android", 256);

            System.out.println("\nPhone details:");
            System.out.println(phone.getDeviceDetails());

            System.out.println("\nPhone1 equals Phone2: " + phone.equals(phone2));
            System.out.println("Phone1 hashCode: " + phone.hashCode());
            System.out.println("Phone2 hashCode: " + phone2.hashCode());

            System.out.println("\nPhone1 equals Phone3: " + phone.equals(phone3));
            System.out.println("Phone1 hashCode: " + phone.hashCode());
            System.out.println("Phone3 hashCode: " + phone3.hashCode());

            // Task #4
            System.out.println("\n#Task 4");
            phone.charge();
            phone.connectToWiFi("HomeNetwork");
            phone.upgradeSystem();
            phone.checkWaterResistance();
            phone.repair();
            phone.displayPhoneDetails();

            System.out.println("\nTotal phones created: " + Phone.getTotalPhonesCreated());

            // Task #5
            System.out.println("\n#Task 5");

            try (InputStream inputStream = Main.class.getResourceAsStream("/TextFile.txt");
                 Scanner scanner = new Scanner(inputStream)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println("Information from file: " + line);
                }
            } catch (Exception e) {
                System.err.println("Error reading file: " + e.getMessage());
            }

            //Task #6
            System.out.println("\n#Task 6");

            phone.installApp("Facebook");
            phone.addContact("Anakin Skywalker");
            phone.updateSetting("Brightness", "70%");
            phone.addNotification("Carol invited you do friend list");
            phone.addRecentCall("Bob");

            System.out.println("\nUpdated Installed Apps: " + phone.getInstalledApps());
            System.out.println("Updated Contacts: " + phone.getContacts());
            System.out.println("Updated Settings: " + phone.getSettings());
            System.out.println("Updated Notifications: " + phone.getNotifications());
            System.out.println("Updated Recent Calls: " + phone.getRecentCalls());

            CustomLinkedList<String> customList = new CustomLinkedList<>();
            customList.add("First Element");
            customList.add("Second Element");
            customList.add("Third Element");

            System.out.println();
            customList.printList();

            // Task #7
            System.out.println("\n#Task 7");

            try {
                File inputFile = new File(Main.class.getResource("/TextFile.txt").getFile());
                String content = FileUtils.readFileToString(inputFile, StandardCharsets.UTF_8);

                String[] words = StringUtils.split(content, " ,.!?\n");

                Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
                int uniqueWordCount = uniqueWords.size();

                File outputFile = new File("src/main/resources/output.txt");
                FileUtils.writeStringToFile(outputFile, "Unique words count: " + uniqueWordCount, StandardCharsets.UTF_8);


            } catch (IOException e) {
                System.err.println("Error processing file: " + e.getMessage());
            }

        } catch (InvalidScreenSizeException | InsufficientBatteryCapacityException | InvalidProcessorException | CameraResolutionException | StorageLimitExceededException e) {
            System.err.println("Exception occurred while creating phone: " + e.getMessage());
        }
    }
}
