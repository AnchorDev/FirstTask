package org.example.classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ReflectionUtil {
    private static final Logger LOGGER = LogManager.getLogger(ReflectionUtil.class);

    public static void performReflection() throws Exception {
        Class<?> phoneClass = Class.forName("org.example.classes.Phone");

        // Get fields
        Field[] fields = phoneClass.getDeclaredFields();
        for (Field field : fields) {
            LOGGER.info("Field: " + field.getName() + ", Type: " + field.getType());
        }

        // Get constructors
        Constructor<?>[] constructors = phoneClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            LOGGER.info("Constructor: " + constructor.getName() + ", Parameters: " + constructor.getParameterCount());
        }

        // Get methods
        Method[] methods = phoneClass.getDeclaredMethods();
        for (Method method : methods) {
            LOGGER.info("Method: " + method.getName() + ", Return Type: " + method.getReturnType());
        }

        // Create new object via reflection
        Constructor<?> constructor = phoneClass.getConstructor(String.class, String.class, String.class, Screen.class, Battery.class, Camera.class, Processor.class, String.class, int.class);
        Phone phone = (Phone) constructor.newInstance("Samsung", "Galaxy S22", "SN123456789", new Screen("1080x2400", 6.7, "OLED"), new Battery(4500, "Lithium-ion", 500), new Camera(64, true), new Processor("Snapdragon 888", 8), "Android", 128);

        // Invoke method via reflection
        Method displayMethod = phoneClass.getMethod("displayPhoneDetails");
        displayMethod.invoke(phone);
    }
}

