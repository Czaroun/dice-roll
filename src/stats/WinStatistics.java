package stats;

import game.printer.GamePrinter;
import players.Player;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WinStatistics implements Statistics {
    private final Map<Player, Integer> score = new HashMap<>();

    @Override
    public void addPlayer(Player player) {
        score.put(player, 0); // dodaj gracza z 0 punktami
    }

    @Override
    public void updatePlayer(Player player) {
        int pts = score.getOrDefault(player, 0);
        score.put(player, pts + 1);
    }

    @Override
    public void removePlayer(String name) {
        Iterator<Map.Entry<Player, Integer>> it = score.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Player, Integer> entry = it.next();
            Player player = entry.getKey();
            if (player.getName().equals(name)) {
                it.remove();
                break;
            } // if
        } // while
    }

    @Override
    public void print(GamePrinter printer) {
        printer.printStats();
        score.forEach((player, pts) -> {
            System.out.println(player.getName() + ": " + pts);
        });
    }
}