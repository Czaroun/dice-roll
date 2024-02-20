package stats;

import players.Player;
import game.printer.GamePrinter;

public interface Statistics {
    void addPlayer(Player player);
    void updatePlayer(Player player);
    void removePlayer(String name);
    void print(GamePrinter printer);
}
