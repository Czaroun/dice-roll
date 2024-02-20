package players;

import java.util.Random;
import game.*;

public class PlayerComp extends Player {
    private Random brain = new Random();

    public PlayerComp() {
    }

    public PlayerComp(String name) {
        super(name); // wywolanie konstruktora klasy nadrzednej (tutaj wywolaj konstruktor players.Player(String name) )
        isComputerPlayer = true;
    }

    @Override
    public int guess(GameScanner gameScanner) {
        return brain.nextInt(6) + 1;
    }
}
