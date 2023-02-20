//2 . Реализуйте алгоритм сортировки пузырьком числового массива,
//    результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class SortLogger {

    static Logger logger = Logger.getLogger(SortLogger.class.getName());


    public static void main(String[] args) {
        configLogger();

        int[] intArray = {3, 12, 5, 1, 9, 2, 4, 10};
        bubbleSort(intArray);
    }

    public static void configLogger() {
        ConsoleHandler cHandler = new ConsoleHandler();
        SimpleFormatter formatter = new SimpleFormatter();
        cHandler.setFormatter(formatter);

        try {
            FileHandler fHandler = new FileHandler("SortLogger.log", 2000, 5);
            fHandler.setFormatter(formatter);
            logger.addHandler(fHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }

        logger.addHandler(cHandler);
        logger.setLevel(Level.INFO);
        logger.setUseParentHandlers(false);
    }

    public static int[] bubbleSort(int[] intArray) {
        int tmp = 0;
        int iterCounter = 1;
        boolean isSorted = false;
        while (!isSorted){
            logger.log(Level.INFO, "Iteration "+ iterCounter + " is started");
            isSorted = true;
            for (int j = 0; j < intArray.length - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    tmp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = tmp;
                    logger.log(Level.INFO, "replaced " + intArray[j] + " and " + intArray[j + 1]);
                    isSorted = false;
                }
            }
            logger.log(Level.INFO, "Iteration " + iterCounter + " is finished. Array: " + Arrays.toString(intArray));
            iterCounter++;
        }
        return intArray;
    }

}
