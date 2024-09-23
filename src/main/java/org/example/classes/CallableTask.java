package org.example.classes;
import java.util.concurrent.Callable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CallableTask implements Callable<Void> {
    private static final Logger LOGGER = LogManager.getLogger(CallableTask.class);

    @Override
    public Void call() throws Exception {
        LOGGER.info("Callable thread is running");
        for (int i = 1; i <= 5; i++) {
            LOGGER.info("Callable - Step " + i);
            Thread.sleep(500);
        }
        LOGGER.info("Callable thread has finished");
        return null;
    }
}

