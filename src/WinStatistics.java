import java.util.HashMap;
import java.util.Map;

public class WinStatistics implements Statistics{
    private Map<Player, Integer> score = new HashMap<>();
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
    public void print(GamePrinter printer) {
        printer.printStats();
        score.forEach( (player, pts) -> {
            System.out.println(player.getName() + ": " + pts);
        });
    }

}
