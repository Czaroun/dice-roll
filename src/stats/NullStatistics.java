package stats;

import players.Player;
import game.printer.GamePrinter;

public class NullStatistics implements Statistics {
    @Override
    public void addPlayer(Player player) {

    }

    @Override
    public void updatePlayer(Player player) {

    }

    @Override
    public void removePlayer(String name) {

    }

    @Override
    public void print(GamePrinter printer) {

    }
}
