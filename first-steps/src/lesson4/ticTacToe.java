package lesson4;

import java.util.Random;
import java.util.Scanner;

public class ticTacToe {

    public static void main(String[] args) {

        playGame();

    }
    public static final int SIZE = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void playGame() {
        char[][] map = createMap(SIZE);
        drawMap(map);

        do {
            humanTurn(map);
            if (checkForWin(map, DOT_X))  {
                // Human Victory
                System.out.println("You Won!");
                break;
            }

            if (endOfTurns(map)) {
                System.out.println("Draw!");
                break;
            }

            aiTurn(map);
            if (checkForWin(map, DOT_O)) {
                // AI Victory
                System.out.println("I Won!");
                break;
            }

            if (endOfTurns(map)) {
                System.out.println("Draw!");
                break;
            }

        } while (true);
    }


    public static char[][] createMap(int size) {
        char[][] map = new char[size][size];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }

        return map;
    }

    public static void drawMap(char[][] map) {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn(char[][] map) {
        int h, v;
        Scanner scn = new Scanner(System.in);
        do {
            System.out.println("Enter string number:");
            h = scn.nextInt();
            System.out.println("Enter column number:");
            v = scn.nextInt();
        } while (!setTurnToMap(h, v, DOT_X, map));

    }

    public static void aiTurn(char[][] map) {
        Random rnd = new Random();
        int h, v;
        do {
            h = rnd.nextInt(SIZE) + 1;
            v = rnd.nextInt(SIZE) + 1;
        }
        while (!setTurnToMap(h, v, DOT_O, map));
    }

    public static boolean setTurnToMap(int h, int v, char symb, char[][] map) {
        if (map[h - 1][v - 1] == DOT_EMPTY) {
            map[h - 1][v - 1] = symb;
            drawMap(map);
            return true;
        } else if (symb == DOT_X) { // Show message for Human turn only
            System.out.println("This space is occupied! Please choose another");
         }
        return false;

    }


    public static boolean checkForWin(char[][] map, char symb) {

        boolean lDiag = true;
        boolean rDiag = true;

        for (int i = 0; i < SIZE; i++) {
            boolean col = true;
            boolean str = true;

            for (int j = 0; j < SIZE; j++) {
                col = col && (map[j][i] == symb); // columns check
                str = str && (map[i][j] == symb); // strings check

            }
            if (col || str) return true;

            lDiag = lDiag && (map[i][i] == symb); // upper left to lower right diag
            rDiag = rDiag && (map[i][SIZE - i - 1] == symb); // upper right to lower left diag

        }
        return lDiag || rDiag;
    }

    public static boolean endOfTurns(char[][] map){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

}
