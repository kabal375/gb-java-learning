package notepad.presenter;

import notepad.model.Notepad;
import notepad.ui.Console;
import notepad.ui.Menu;


public class Presenter {
    Console console;
    Notepad notepad;

    public Presenter(Console console, Notepad notepad) {
        this.console = console;
        this.notepad = notepad;
    }

    public void init() {
        int item = -1;
        while (true) {
            item = -1;
            try {
                item = Integer.parseInt(console.showMenu());
            } catch (NumberFormatException e) {
                console.printMessage(e.getMessage());
                console.printMessage("Incorrect input!!! Enter number 0-" + (Menu.menuMap.size() - 1));
            }

            switch (item) {
                case 0 -> System.exit(0);
                case 1 -> console.showAllNotes(notepad.getNotes());
                case 2 -> notepad.add(console.newNote());
                case 3 -> console.showAllNotes(notepad.find(console.getString("Looking for: ")));
                case 4 -> {
                    try {
                        int index = Integer.parseInt(console.getString("Enter index of the note to delete: "));
                        notepad.delete(index);
                        console.printMessage("Note " + index + " is deleted");
                    } catch (NumberFormatException e) {
                        console.printMessage("Incorrect input!!! Index should be a number!");
                    } catch (IndexOutOfBoundsException e) {
                        console.printMessage("Note with such index not found!");
                    }

                }
//                case 6 -> {
//                    System.out.println(laptopFilter.filterSet);
//                    showFiltered(laptopSet, laptopFilter);
            }
        }
    }
}
