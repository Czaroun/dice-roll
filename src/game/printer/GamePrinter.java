package game.printer;

import game.Game;
import players.*;

public interface GamePrinter {
    void printGameWithStatistics();

    void printGameWithSettings();

    void printSingleOrMulti();

    void printDefaultSettings();

    void printEnterNameSingle();

    void printMenuMulti(Game game);

    void printEnterNameMulti();

    void printRemovePlayerHuman();

    void printDice(int number);

    void printPlayerTurn(Player player);

    void printPlayerGuess(Player player, int guess);

    void printHowManyRounds();

    void printCorrectAnswer();

    void printWrongAnswer();

    void printStats();
}
