package settings;

import game.GameScanner;
import game.printer.GamePrinter;

public interface Settings {
    void setGameMode(GamePrinter printer, GameScanner scanner);
    boolean isMultiPlayer();
    int getRounds();
    void setRounds(int rounds);
}
