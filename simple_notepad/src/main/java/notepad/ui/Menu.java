package notepad.ui;

import notepad.presenter.Presenter;

import java.util.HashMap;
import java.util.Map;

public class Menu {


    public final static Map<Integer, String> menuMap;

    static {
        menuMap = new HashMap<>();
        menuMap.put(0, "Exit");
        menuMap.put(1, "Show all notes");
        menuMap.put(2, "New note");
        menuMap.put(3, "Find note");
        menuMap.put(4, "Delete note");
    }

    public static void runCommand (Presenter presenter, int item) {
        switch (item) {
            case 0 -> presenter.exitProgram();
            case 1 -> presenter.showAllNotes();
            case 2 -> presenter.newNote();
            case 3 -> presenter.findNote();
            case 4 -> presenter.deleteNote();
        }
    }

}
