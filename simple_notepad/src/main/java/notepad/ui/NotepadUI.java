package notepad.ui;

import java.util.Map;

public interface NotepadUI {

    String newNote();

    void showNotes(Map<Integer, String> records);

    String getString(String message);

    void showMessage(String s);
}
