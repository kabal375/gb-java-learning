package notepad.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notepad {

    private List<Note> npData;

    public Notepad() {
        this.npData = new ArrayList<>();
    }

    public Map<Integer, String> getNotes() {
        Map<Integer, String> results = new HashMap<>();
        String note;
        for (int i = 0; i < npData.size(); i++) {
            note = npData.get(i).toString();
            results.put(i, note);
            }
        return results;
    }

    public void add(String title, String content) {
        Note note = new Note();
        note.setTitle(title);
        note.setContent(content);
        npData.add(note);
    }

    public void delete(int index) throws ArrayIndexOutOfBoundsException {
        npData.remove(index);
    }

    public Map<Integer, String> find(String substring) {
        Map<Integer, String> results = new HashMap<>();
        String note;
        for (int i = 0; i < npData.size(); i++) {
            note = npData.get(i).toString();
            if (note.toLowerCase().contains(substring.toLowerCase())) {
                results.put(i, note);
            }
        }
        return results;
    }
}
