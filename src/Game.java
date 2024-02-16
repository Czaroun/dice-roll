import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private Random dice = new Random();
    private List<Player> players = new ArrayList<>();
    private int cnt = -1;
    public final Statistics stats;
    public Game() {
        this(null);
    }
    public Game(Statistics stats) {
        if (stats != null) {
            this.stats = stats;
        }
        else {
            this.stats = new NullStatistics();
        }
    }
    public void addPlayer(Player player) {
        players.forEach( p -> {
            if (player.getName().equals(p.getName())) {
                player.setName(player.getName() + cnt);
                cnt -= 1;
            }
        });
        players.add(player);
        stats.addPlayer(player);
    }
    public void printStats() {
        stats.print();
    }
    public void printPlayers() {
        players.forEach( (player) -> {
            System.out.println(player.getName());
        });
        System.out.println("---------------------------");
    }
    public void removePlayer(String name) {
        players.removeIf(player -> player.getName().equals(name));
    }
    public void play() {
        int number;
        int guess = 0;
        boolean repeat = true;

        do {
            number = dice.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            for (Player player : players) {
                guess = player.guess();
                System.out.println("Gracz: " + player.getName() + ": " + guess);
                if (guess == number) {
                    System.out.println("BRAWO!");
                    repeat = false;
                    stats.updatePlayer(player);
                }
                else {
                    System.out.println("ŹLE");
                }
            }
        }
        while (repeat);
    }
}
