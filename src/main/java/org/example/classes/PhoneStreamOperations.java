package org.example.classes;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class PhoneStreamOperations {
    private static final Logger LOGGER = LogManager.getLogger(PhoneStreamOperations.class);

    public static void performStreamOperations(Phone phone) {
        // Map: Convert app names to uppercase
        List<String> uppercasedApps = phone.getInstalledApps().stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        LOGGER.info("Uppercased Apps: " + uppercasedApps);

        // Filter: Get contacts that contain "Anakin"
        Set<String> filteredContacts = phone.getContacts().stream()
                .filter(contact -> contact.contains("Anakin"))
                .collect(Collectors.toSet());
        LOGGER.info("Filtered Contacts: " + filteredContacts);

        // ForEach: Print all settings
        phone.getSettings().forEach((key, value) -> LOGGER.info("Setting: " + key + " = " + value));

        // Map: Get first letter of each contact
        List<String> contactInitials = phone.getContacts().stream()
                .map(contact -> contact.substring(0, 1))
                .collect(Collectors.toList());
        LOGGER.info("Contact Initials: " + contactInitials);

        // Reduce: Concatenate all notifications
        String concatenatedNotifications = phone.getNotifications().stream()
                .reduce((notif1, notif2) -> notif1 + ", " + notif2)
                .orElse("No notifications");
        LOGGER.info("Concatenated Notifications: " + concatenatedNotifications);

        // Filter and Map: Installed apps starting with 'F'
        List<String> appsStartingWithF = phone.getInstalledApps().stream()
                .filter(app -> app.startsWith("F"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        LOGGER.info("Apps starting with F: " + appsStartingWithF);

        // Reduce: Count total characters in all recent calls
        int totalCharsInRecentCalls = phone.getRecentCalls().stream()
                .reduce(0, (sum, call) -> sum + call.length(), Integer::sum);
        LOGGER.info("Total characters in recent calls: " + totalCharsInRecentCalls);
    }
}

