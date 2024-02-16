import java.util.Scanner;

public class GamePrinterPL implements GamePrinter {
    private Scanner input = new Scanner(System.in);
    @Override
    public void printGameWithStatistics() {
        System.out.println("1.Gra ze statystykami");
        System.out.println("2.Gra bez statystyk");
    }
}
