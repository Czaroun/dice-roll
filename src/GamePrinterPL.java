import java.util.Scanner;

public class GamePrinterPL implements GamePrinter {
    private Scanner input = new Scanner(System.in);
    @Override
    public void printGameWithStatistics() {
        System.out.println("1.Gra ze statystykami");
        System.out.println("2.Gra bez statystyk");
    }

    @Override
    public void printSingleOrMulti() {
        System.out.println("1.Gra jednoosobowa");
        System.out.println("2.Gra wieloosobowa");
    }

    @Override
    public void printEnterNameSingle() {
        System.out.println("Wprowadz swoje imie: ");
    }

    @Override
    public void printMenuMulti(Game game) {
        System.out.println("---------------------------");
        System.out.println("LISTA GRACZY:");
        game.printPlayers();
        System.out.println("---------------------------");
        System.out.println("MENU:");
        System.out.println("1.Dodaj nowego gracza");
        System.out.println("2.Usuń gracza");
        System.out.println("3.Dodaj nowego gracza (komputer)");
        System.out.println("4.Usuń gracza (komputer)");
        System.out.println("5.Rozpocznij gre");
    }
}