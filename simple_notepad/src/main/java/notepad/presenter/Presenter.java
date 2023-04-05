package notepad.presenter;

import notepad.model.Notepad;
import notepad.ui.NotepadUI;

import java.io.IOException;
import java.util.logging.*;


public class Presenter {
    private final NotepadUI ui;
    private final Notepad notepad;

    static Logger logger = Logger.getLogger(Presenter.class.getName());

    static  {
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

    public Presenter(NotepadUI ui) {
        this.ui = ui;
        this.notepad = new Notepad();
        logger.log(Level.INFO, "Notepad application is started");
    }


    public void exitProgram() {
        logger.log(Level.INFO, "Notepad application is finishing");
        System.exit(0);
    }

    public void showAllNotes() {
        ui.showNotes(notepad.getNotes());
    }

    public void newNote() {
        String title = ui.getString("Enter a title for new note: ");
        String content = ui.newNote();
        notepad.add(title, content);
        logger.log(Level.INFO, "New note was created");
    }

    public void findNote() {
        ui.showNotes(notepad.find(ui.getString("Looking for: ")));
    }

    public void deleteNote() {
        try {
            int index = Integer.parseInt(ui.getString("Enter index of the note to delete: "));
            notepad.delete(index);
            ui.showMessage("Note " + index + " was deleted");
            logger.log(Level.WARNING, "Note " + index + " was deleted");
        } catch (NumberFormatException e) {
            ui.showMessage("Incorrect input!!! Index should be a number!");
            logger.log(Level.WARNING, e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            ui.showMessage("Note with such index not found!");
            logger.log(Level.WARNING, e.getMessage());
        }

    }
}
