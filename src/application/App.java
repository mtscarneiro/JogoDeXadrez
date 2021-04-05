package application;

import java.util.Locale;
import java.util.Scanner;

import boardgame.Board;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Board board = new Board(8, 8);

        input.close();
    }
}
