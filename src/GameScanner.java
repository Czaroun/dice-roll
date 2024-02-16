import java.util.Scanner;

public class GameScanner {
    private Scanner input = new Scanner(System.in);
    public Statistics GameWithStatistics(){
        int choice;
        do {
            choice = input.nextInt();
        }
        while (choice != 1 && choice != 2);
        if (choice == 1) {
            return new WinStatistics();
        }
        else {
            return null;
        }
    }

}
