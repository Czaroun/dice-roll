import java.sql.SQLOutput;

public class GamePrinterEN implements GamePrinter{
    @Override
    public void printGameWithStatistics() {
        System.out.println("1.Game with statistics");
        System.out.println("2.Game without statistics");
    }

    @Override
    public void printSingleOrMulti() {
        System.out.println("1.Singleplayer");
        System.out.println("2.Multiplayer");
    }

    @Override
    public void printEnterNameSingle() {
        System.out.println("Enter your name: ");
    }

    @Override
    public void printMenuMulti(Game game) {
        System.out.println("---------------------------");
        System.out.println("LIST OF PLAYERS:");
        game.printPlayers();
        System.out.println("---------------------------");
        System.out.println("MENU:");
        System.out.println("1.Add new player");
        System.out.println("2.Delete player");
        System.out.println("3.Add new player (computer)");
        System.out.println("4.Delete player (computer)");
        System.out.println("5.Start game");
    }

    @Override
    public void printEnterNameMulti() {
        System.out.println("Enter playerr name: ");
    }
}