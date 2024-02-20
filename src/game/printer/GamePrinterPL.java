package game.printer;

import game.Game;
import players.*;

public class GamePrinterPL implements GamePrinter {
    @Override
    public void printGameWithStatistics() {
        System.out.println("1.Gra ze statystykami");
        System.out.println("2.Gra bez statystyk");
    }

    @Override
    public void printGameWithSettings() {
        System.out.println("1.Szybka gra jednoosobowa");
        System.out.println("2.Tryb gry (Singleplayer/Multiplayer, Dostosowane ustawienia)");
    }

    @Override
    public void printSingleOrMulti() {
        System.out.println("1.Gra jednoosobowa");
        System.out.println("2.Gra wieloosobowa");
    }

    @Override
    public void printDefaultSettings() {
        System.out.println("USTAWIENIA DOMYSLNE:");
        System.out.println("- gra jednoosobowa");
        System.out.println("- 5 rund");
    }

    @Override
    public void printEnterNameSingle() {
        System.out.println("Wprowadz swoje imie: ");
    }

    @Override
    public void printMenuMulti(Game game) {
        System.out.println("---------------------------");
        System.out.println("LISTA GRACZY:");
        game.printPlayers();
        System.out.println("---------------------------");
        System.out.println("1.Dodaj nowego gracza");
        System.out.println("2.Usun gracza");
        System.out.println("3.Dodaj nowego gracza (komputer)");
        System.out.println("4.Usun gracza (komputer)");
        System.out.println("5.Rozpocznij gre");
    }

    @Override
    public void printEnterNameMulti() {
        System.out.println("DODAWANIE NOWEGO GRACZA");
        System.out.println("Wprowadz imie gracza: ");
    }

    @Override
    public void printRemovePlayerHuman() {
        System.out.println("USUWANIE GRACZA");
        System.out.println("Wprowadz imie gracza");
    }

    @Override
    public void printDice(int number) {
        System.out.println("\nKostka: " + number);
    }

    public void printPlayerTurn(Player player) {
        System.out.println("Gracz " + player.getName() + " - podaj liczbe:");
    }

    @Override
    public void printPlayerGuess(Player player, int guess) {
        System.out.println("Gracz " + player.getName() + ": " + guess);
    }

    @Override
    public void printHowManyRounds() {
        System.out.println("Ile rund chcesz zagrac?");
    }

    @Override
    public void printCorrectAnswer() {
        System.out.println("BRAWO! Trafiles");
    }

    @Override
    public void printWrongAnswer() {
        System.out.println("ZLE! Nie trafiles");
    }

    @Override
    public void printStats() {
        System.out.println("---------------------------");
        System.out.println("STATYSTYKI");
    }
}