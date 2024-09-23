package org.example.classes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunnableTask implements Runnable {
    private static final Logger LOGGER = LogManager.getLogger(RunnableTask.class);
    private String threadName;

    public RunnableTask(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        LOGGER.info(threadName + " is running");
        for (int i = 1; i <= 5; i++) {
            LOGGER.info(threadName + " - Step " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                LOGGER.error("Thread interrupted", e);
            }
        }
        LOGGER.info(threadName + " has finished");
    }
}

