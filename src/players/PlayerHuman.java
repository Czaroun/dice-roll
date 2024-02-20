package players;

import java.util.Scanner;
import game.*;
public class PlayerHuman extends Player {
    private Scanner input = new Scanner(System.in);
    private String name = "NoName";

    public PlayerHuman() {
    }

    public PlayerHuman(String name) {
        super(name); // wywolanie konstruktora klasy nadrzednej (tutaj wywolaj konstruktor players.Player(String name) )
    }

    @Override
    public int guess(GameScanner gameScanner) {
        return gameScanner.enterNumber();
    }
}
