package notepad.ui;

import java.util.Map;

public interface NotepadUI {

    String newNote();

    void showAllNotes(Map<Integer, String> records);

    String getString(String message);
}
