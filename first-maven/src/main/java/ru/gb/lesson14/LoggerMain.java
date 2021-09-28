package ru.gb.lesson14;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerMain {

       public static final Logger log = LogManager.getLogger(LoggerMain.class);


    public static void main(String[] args) {

        log.error("Something went wrong due to no config detected");
        log.warn("Some warning");

        divideByZero();

    }

    static float divideByZero() {
        try {
            return 10 / 0;
        } catch (ArithmeticException e) {
            log.error("Divide by zero is forbidden!", e);
        }
        return 0;
    }

}
