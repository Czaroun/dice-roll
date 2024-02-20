package game;

import printer.*;
import settings.*;
import stats.*;

import java.util.Scanner;

public class GameScanner {
    private Scanner input = new Scanner(System.in);
    private int choice = 0;
    private MultiUserSettings multiUserSettings = new MultiUserSettings();
    public Statistics gameWithStatistics(){
        setDefaultChoice();
        do {
            choice = input.nextInt();
        }
        while (choice != 1 && choice != 2);
        input.nextLine(); // bufor clear
        if (choice == 1) { // 1 - gra ze statystykami
            return new WinStatistics();
        }
        else { // 2 - gra bez statystyk
            return null;
        }
    }
    public Settings gameWithSettings() {
        setDefaultChoice();
        do {
            choice = input.nextInt();
        }
        while (choice != 1 && choice != 2);
        input.nextLine(); // bufor clear
        if (choice == 1) { // 1 - ustawienia domyslne
            return null;
        }
        else { // 2 - ustawienia uzytkownika
            return new UserSettings();
        }
    }
    public boolean singleOrMulti() {
        setDefaultChoice();
        do {
            choice = input.nextInt();
        }
        while (choice != 1 && choice != 2);
        input.nextLine(); // bufor clear
        // 1 - singleplayer, 2 - multiplayer
        return choice == 2;
    }
    public String enterName() {
        return input.nextLine();
    }
    public int enterNumber() {
        int number = input.nextInt();
        input.nextLine();
        return number;
    }
    public boolean menuMulti(Game game, GamePrinter printer) {
        setDefaultChoice();
        do {
            choice = input.nextInt();
        }
        while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5);
        input.nextLine();
        switch (choice) {
            case 1:
                multiUserSettings.addPlayerHuman(game, printer, this);
                break;
            case 2:
                multiUserSettings.removePlayerHuman(game, printer, this);
                break;
            case 3:
                multiUserSettings.addPlayerComp(game);
                break;
            case 4:
                multiUserSettings.removePlayerComp(game);
                break;
            case 5:
                System.out.println();
                return false;
        }
        return true;
    }
    private void setDefaultChoice() {
        choice = 0;
    }
    public void close() {
        input.close();
    }

}
