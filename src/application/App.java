package application;

import java.util.Locale;
import java.util.Scanner;

import boardgame.Position;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Position pos = new Position(row, column);

        input.close();
    }
}
