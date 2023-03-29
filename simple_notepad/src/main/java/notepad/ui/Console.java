package notepad.ui;

import java.util.Map;
import java.util.Scanner;

public class Console implements NotepadUI {
    private Scanner scanner;


    public Console() {
        this.scanner = new Scanner(System.in);
    }

    public String showMenu() {
        for (int i = 0; i < Menu.menuMap.size(); i++) {
            System.out.println(i + ": " + Menu.menuMap.get(i));
        }
        System.out.print("Enter your choice: ");
        return scanner.nextLine();
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
    public void showAllNotes(Map<Integer, String> records) {
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


    public void printMessage(String message) {
        System.out.println(message);
    }

}

