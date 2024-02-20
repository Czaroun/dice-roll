package settings;

import game.GameScanner;
import game.printer.GamePrinter;

public class DefaultSettings implements Settings {
    private final int rounds = 5;
    private boolean isMultiplayer;

    @Override
    public void setGameMode(GamePrinter printer, GameScanner scanner) {
        isMultiplayer = true;
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
    }
}
