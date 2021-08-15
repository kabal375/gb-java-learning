package lesson3;

import java.util.Random;
import java.util.Scanner;

public class wordsGame {

    public static void main(String[] args) {
        System.out.println("Hello!");

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        playGame(words);

    }

    public static void playGame(String[] words) {
        String wordAI = pickRandomWord(words);
        String wordUser = "";
        System.out.println("I made a word from list. Can you guess it? I'll help while you try...");
        System.out.println();
        System.out.println("List of words:");
        for (String word : words) {
            System.out.print(word + ", ");
        }
        System.out.println();
        System.out.println();

        while (!checkForWin(wordAI, wordUser)) {
            wordUser = userTry();
            compareAndResults(wordAI, wordUser);
        }
        System.out.println("Congratulations!");
        System.out.println("You won!");
    }

    public static String pickRandomWord(String[] arr) {
        Random rnd = new Random();
        String word = arr[rnd.nextInt(arr.length)];
        return word;
    }

    public static String userTry() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your guess:");

        return userInput.nextLine().trim();

    }

    public static boolean checkForWin(String wordAI, String wordUser) {
        return wordAI.equalsIgnoreCase(wordUser);
    }

    public static void compareAndResults(String wordAI, String wordUser) {
        for (int i = 0; i < 15; i++) {
            if (i < (getMinStringLength(wordAI, wordUser))) {
                char letter = wordUser.charAt(i) == wordAI.charAt(i) ? wordUser.charAt(i) : '#';
                System.out.print(letter);
            } else {
            System.out.print("#");
            }
        }
        System.out.println();
    }

    public static int getMinStringLength(String str1, String str2) {
        if (str2.length() < str1.length()) {
            return str2.length();
        } else {
            return str1.length();
        }
    }

}
