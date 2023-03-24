package notepad.presenter;

import notepad.model.Notepad;
import notepad.ui.Console;

import static notepad.ui.Console.menuMap;

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
                console.printMessage("Incorrect input!!! Enter number 0-" + (menuMap.size() - 1));
            }

            switch (item) {
                case 0 -> System.exit(0);
                case 1 -> console.showAllNotes(notepad.getAllNotes());
                case 2 -> notepad.add(console.newNote());
                case 3 -> System.exit(0); //TODO (find note);
                case 4 -> System.exit(0); //TODO Delete note;
//                case 6 -> {
//                    System.out.println(laptopFilter.filterSet);
//                    showFiltered(laptopSet, laptopFilter);
            }
        }
    }
}
