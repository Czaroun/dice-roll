package players;

import game.GameScanner;

public class PlayerHuman extends Player {
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