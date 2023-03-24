package notepad.ui;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Console {
    private Scanner scanner;
    public final static Map<Integer, String> menuMap;

    static {
        menuMap = new HashMap<>();
        menuMap.put(0, "Exit");
        menuMap.put(1, "Show all notes");
        menuMap.put(2, "New note");
        menuMap.put(3, "Find note");
        menuMap.put(4, "Delete note");
    }


    public Console() {
        this.scanner = new Scanner(System.in);
    }

    public String showMenu() {
        for (int i = 0; i < menuMap.size(); i++) {
            System.out.println(i + ": " + menuMap.get(i));
        }
        System.out.print("Enter your choice: ");
        return scanner.nextLine();
    }

    public String newNote() {
        String input;
        StringBuilder note = new StringBuilder();
        System.out.println("Enter new note text line by line. Empty line to finish: ");
        while ((input = scanner.nextLine()).length() > 0) {
            note.append(input).append("\n");
        }
        return note.toString();
    }

    public void showAllNotes(String[] records) {
        for (int i = 0; i < records.length; i++) {

            System.out.println(i + ":--");
            System.out.println(records[i]);
        }
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

}

