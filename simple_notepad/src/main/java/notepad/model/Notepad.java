package notepad.model;

import java.util.ArrayList;
import java.util.List;

public class Notepad {

    private List<String> npData;

    public Notepad() {
        this.npData = new ArrayList<>();
    }

    public String[] getAllNotes() {
        String[] allNotes = new String[npData.size()];
        return npData.toArray(allNotes);
    }

    public void add(String note) {
        npData.add(note);
    }
}
