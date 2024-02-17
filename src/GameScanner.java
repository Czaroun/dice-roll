import java.util.Scanner;

public class GameScanner {
    private Scanner input = new Scanner(System.in);
    private int choice = 0;
    public Statistics GameWithStatistics(){
        setDefaultChoice();
        do {
            choice = input.nextInt();
        }
        while (choice != 1 && choice != 2);
        input.nextLine(); // bufor clear
        if (choice == 1) { // 1 - gra ze statystykami
            return new WinStatistics();
        }
        else { // 2 - gra bez statystyk
            return null;
        }
    }
    public boolean singleOrMulti() {
        setDefaultChoice();
        do {
            choice = input.nextInt();
        }
        while (choice != 1 && choice != 2);
        input.nextLine(); // bufor clear
        // 1 - singleplayer, 2 - multiplayer
        return choice == 1;
    }
    public String EnterNameSingle() {
        return input.nextLine();
    }


    private void setDefaultChoice() {
        choice = 0;
    }
    public void close() {
        input.close();
    }

}
