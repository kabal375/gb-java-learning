package notepad.presenter;

import notepad.model.Notepad;
import notepad.ui.NotepadUI;


public class Presenter {
    private final NotepadUI ui;
    private final Notepad notepad;

    public Presenter(NotepadUI ui) {
        this.ui = ui;
        this.notepad = new Notepad();
    }


    public void exitProgram() {
        System.exit(0);
    }

    public void showAllNotes() {
        ui.showNotes(notepad.getNotes());
    }

    public void newNote() {
        notepad.add(ui.newNote());
    }

    public void findNote() {
        ui.showNotes(notepad.find(ui.getString("Looking for: ")));
    }

    public void deleteNote() {
        try {
            int index = Integer.parseInt(ui.getString("Enter index of the note to delete: "));
            notepad.delete(index);
            ui.showMessage("Note " + index + " is deleted");
        } catch (NumberFormatException e) {
            ui.showMessage("Incorrect input!!! Index should be a number!");
        } catch (IndexOutOfBoundsException e) {
            ui.showMessage("Note with such index not found!");
        }

    }
}
