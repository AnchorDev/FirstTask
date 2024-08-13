package org.example;

public class Main {
    public static void main(String[] args) {
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



        //Task #2 and #3
        Screen screen = new Screen("1080x2400", 6.7);
        Battery battery = new Battery(4500, "Lithium-ion");
        Camera camera = new Camera(64, true);
        Processor processor = new Processor("Snapdragon 888", 8);

        Phone phone = new Phone("Samsung", "Galaxy S21", screen, battery, camera, processor);
        Phone phone2 = new Phone("Samsung", "Galaxy S21", screen, battery, camera, processor);

        Screen screen3 = new Screen("1440x3200", 6.9);
        Battery battery3 = new Battery(5000, "Lithium-ion");
        Camera camera3 = new Camera(108, true);
        Processor processor3 = new Processor("Exynos 2100", 8);

        Phone phone3 = new Phone("Samsung", "Galaxy S21 Ultra", screen3, battery3, camera3, processor3);

        System.out.println("\nPhone details:");
        System.out.println(phone.getDeviceDetails());

        System.out.println("\nPhone1 equals Phone2: " + phone.equals(phone2));
        System.out.println("Phone1 hashCode: " + phone.hashCode());
        System.out.println("Phone2 hashCode: " + phone2.hashCode());

        System.out.println("\nPhone1 equals Phone3: " + phone.equals(phone3));
        System.out.println("Phone1 hashCode: " + phone.hashCode());
        System.out.println("Phone3 hashCode: " + phone3.hashCode());
    }
}