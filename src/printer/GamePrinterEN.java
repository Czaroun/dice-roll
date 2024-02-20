package printer;

import game.Game;
import players.*;
public class GamePrinterEN implements GamePrinter {
    @Override
    public void printGameWithStatistics() {
        System.out.println("1.game.Game with statistics");
        System.out.println("2.game.Game without statistics");
    }

    @Override
    public void printGameWithSettings() {
        System.out.println("1.Quick singleplayer game");
        System.out.println("2.game.Game mode (Singleplayer/Multiplayer, Customised settings)");
    }

    @Override
    public void printSingleOrMulti() {
        System.out.println("1.Singleplayer");
        System.out.println("2.Multiplayer");
    }

    @Override
    public void printDefaultSettings() {
        System.out.println("DEFAULT SETTINGS:");
        System.out.println("- singleplayer");
        System.out.println("- 5 rounds");
    }

    @Override
    public void printEnterNameSingle() {
        System.out.println("Enter your name: ");
    }

    @Override
    public void printMenuMulti(Game game) {
        System.out.println("---------------------------");
        System.out.println("LIST OF PLAYERS:");
        game.printPlayers();
        System.out.println("---------------------------");
        System.out.println("1.Add new player");
        System.out.println("2.Remove player");
        System.out.println("3.Add new player (computer)");
        System.out.println("4.Remove player (computer)");
        System.out.println("5.Start game");
    }

    @Override
    public void printEnterNameMulti() {
        System.out.println("ADDING NEW PLAYER");
        System.out.println("Enter player name: ");
    }

    @Override
    public void printRemovePlayerHuman() {
        System.out.println("REMOVING PLAYER");
        System.out.println("Enter player name: ");
    }

    @Override
    public void printDice(int number) {
        System.out.println("\nDice: " + number);
    }

    @Override
    public void printPlayerTurn(Player player) {
        System.out.println("players.Player" + player.getName() + " - enter number:");
    }

    @Override
    public void printPlayerGuess(Player player, int guess) {
        System.out.println("players.Player " + player.getName() + ": " + guess);
    }

    @Override
    public void printHowManyRounds() {
        System.out.println("How many rounds would you like to play?");
    }

    @Override
    public void printCorrectAnswer() {
        System.out.println("Well done! You hit number");
    }

    @Override
    public void printWrongAnswer() {
        System.out.println("Missed! You didn't hit");
    }

    @Override
    public void printStats() {
        System.out.println("---------------------------");
        System.out.println("STATISTICS");
    }
}