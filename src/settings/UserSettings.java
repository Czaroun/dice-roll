package settings;

import game.GameScanner;
import game.printer.GamePrinter;

public class UserSettings implements Settings {
    private boolean isMultiplayer;
    private int rounds;
    @Override
    public void setGameMode(GamePrinter printer, GameScanner scanner) {
        printer.printSingleOrMulti();
        isMultiplayer = scanner.singleOrMulti();
    }
    @Override
    public boolean isMultiPlayer() {
        return isMultiplayer;
    }
    @Override
    public int getRounds() {
        return rounds;
    }

    @Override
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
}