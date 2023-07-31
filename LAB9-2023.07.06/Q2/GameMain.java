package com.mycompany.gamemain;
import java.util.Scanner;

public class GameMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LifeGame lG = new LifeGame();

        System.out.println("Welcome to the 'Life' RPG game!");
        System.out.println("Press 'W' to move UP, 'S' to move DOWN, 'A' to move LEFT, 'D' to move RIGHT.");
        System.out.println("Press 'Q' to quit the game.");

        char input;
        do {
            input = scanner.next().charAt(0);
            switch (Character.toUpperCase(input)) {
                case 'W':
                    lG.moveup();
                    break;
                case 'S':
                    lG.movedown();
                    break;
                case 'A':
                    lG.moveleft();
                    break;
                case 'D':
                    lG.moveright();
                    break;
                case 'Q':
                    System.out.println("Exiting the game.");
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        } while (Character.toUpperCase(input) != 'Q');
    }
}
