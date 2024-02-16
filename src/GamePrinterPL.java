import java.util.Scanner;

public class GamePrinterPL implements GamePrinter {
    private Scanner input = new Scanner(System.in);
    @Override
    public boolean printGameWithStatistics() {
        System.out.println("1.Gra ze statystykami");
        System.out.println("2.Gra bez statystyk");
        int choice;
        do {
            choice = input.nextInt();
        }
        while (choice != 1 && choice != 2);
        if (choice == 1) {
            return true;
        }
        else {
            return false;
        }
    }
}
