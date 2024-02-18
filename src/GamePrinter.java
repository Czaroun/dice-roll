import java.util.Scanner;

public interface GamePrinter {
    void printGameWithStatistics();
    void printSingleOrMulti();
    void printEnterNameSingle();
    void printMenuMulti(Game game);
    void printEnterNameMulti();
    void printRemovePlayerHuman();
    void printDice(int number);
    void printPlayerTurn(Player player);
    void printHowManyRounds();
    void printCorrectAnswer();
    void printWrongAnswer();
    void printStats();
}
