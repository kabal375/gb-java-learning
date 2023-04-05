package notepad.ui;

import notepad.presenter.Presenter;

import java.util.Map;
import java.util.Scanner;

public class Console implements NotepadUI {
    private final Scanner scanner;
    private final Presenter presenter;


    public Console() {
        this.scanner = new Scanner(System.in);
        this.presenter = new Presenter(this);
    }

    public String showMenu() {
        for (int i = 0; i < Menu.menuMap.size(); i++) {
            System.out.println(i + ": " + Menu.menuMap.get(i));
        }
        System.out.print("Enter your choice: ");
        return scanner.nextLine().strip();
    }

    public void init() {
        int item;
        while (true) {
            item = -1;
            try {
                item = Integer.parseInt(showMenu());
            } catch (NumberFormatException e) {
                showMessage(e.getMessage());
                showMessage("Incorrect input!!! Enter number 0-" + (Menu.menuMap.size() - 1));
            }

            Menu.runCommand(presenter, item);
        }
    }

    public void init() {
        int item;
        while (true) {
            item = -1;
            try {
                item = Integer.parseInt(showMenu());
            } catch (NumberFormatException e) {
                showMessage(e.getMessage());
                showMessage("Incorrect input!!! Enter number 0-" + (Menu.menuMap.size() - 1));
            }

            switch (item) {
                case 0 -> presenter.exitProgram();
                case 1 -> presenter.showAllNotes();
                case 2 -> presenter.newNote();
                case 3 -> presenter.findNote();
                case 4 -> presenter.deleteNote();
            }
        }
    }

    @Override
    public String newNote() {
        String input;
        StringBuilder note = new StringBuilder();
        System.out.println("Enter new note text line by line. Empty line to finish: ");
        while ((input = scanner.nextLine()).length() > 0) {
            note.append(input).append("\n");
        }
        return note.toString();
    }

    @Override
    public void showNotes(Map<Integer, String> records) {
        for (Map.Entry<Integer, String> entry:
             records.entrySet()) {
            System.out.println(entry.getKey() + ": ----");
            System.out.println(entry.getValue());
        }
    }

    @Override
    public String getString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }


    public void showMessage(String message) {
        System.out.println(message);
    }

}

