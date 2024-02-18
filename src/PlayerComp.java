import java.util.Random;

public class PlayerComp extends Player{
    private Random brain = new Random();
    public PlayerComp() {}
    public PlayerComp(String name) {
        super(name); // wywolanie konstruktora klasy nadrzednej (tutaj wywolaj konstruktor Player(String name) )
        isComputerPlayer = true;
    }
    @Override
    public int guess() {
        return brain.nextInt(6) + 1;
    }
}
