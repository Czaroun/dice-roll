package settings;

import game.GameScanner;
import printer.GamePrinter;
public class DefaultSettings implements Settings {
    private boolean isMultiplayer;
    private int rounds = 5;
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
    public void setRounds(int rounds) {}
}
