import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private Random dice = new Random();
    private List<Player> players = new ArrayList<>();
    private int cnt = -1;
    private int cntBot = -1;
    private int rounds = 5;
    public final Settings settings;
    public final Statistics stats;
    public Game() {
        this(null, null);
    }
    public Game(Settings settings, Statistics stats) {
        if (settings != null) {
            this.settings = settings;
        }
        else {
            this.settings = new DefaultSettings();
        }

        if (stats != null) {
            this.stats = stats;
        }
        else {
            this.stats = new NullStatistics();
        }
    }
    public void config(GamePrinter printer, GameScanner scanner) {
        settings.setGameMode(printer, scanner);
    }
    public void addPlayer(Player player) {
        players.forEach( p -> {
            if (player.getName().equals(p.getName())) {
                player.setName(player.getName() + (player.getIsComputerPlayer() ? cntBot : cnt));
                if (player.getIsComputerPlayer()) {
                    cntBot -= 1;
                }
                else {
                    cnt -= 1;
                }
            }
        });
        players.add(player);
        stats.addPlayer(player);
    }


    public void printPlayers() {
        players.forEach( (player) -> {
            System.out.println(player.getName());
        });
    }
    public void removePlayer(String name) {
        players.removeIf(player -> player.getName().equals(name));
        if (name.startsWith("Bot-")) {
            cntBot++;
        }
    }
    public int getCntBot() {
        return cntBot;
    }
    public void play(GamePrinter printer, GameScanner gameScanner) {
        int guess = 0;
        int number = dice.nextInt(6) + 1;

        // Comment out the line bellow to avoid seeing the corect answer
        printer.printDice(number);
        ///////////////////////////////////////////

        for (Player player : players) {
            printer.printPlayerTurn(player);
            guess = player.guess(gameScanner);
                if (guess == number) {
                    printer.printCorrectAnswer();
                    stats.updatePlayer(player);
                }
                else {
                    printer.printWrongAnswer();
                }
            }
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
}
