package notepad.ui;

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
}
