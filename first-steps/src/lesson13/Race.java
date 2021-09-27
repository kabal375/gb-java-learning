package lesson13;

import java.util.ArrayList;
import java.util.Arrays;

public class Race {
    public static boolean isFinished = false;
    public static String raceWinner;

    private ArrayList<Stage> stages;
    public ArrayList<Stage> getStages() { return stages; }
    public Race(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
    }
}
