import java.util.Scanner;

public class PlayerHuman extends Player{
    private Scanner input = new Scanner(System.in);
    private String name = "NoName";
    public PlayerHuman() {}
    public PlayerHuman(String name) {
        super(name); // wywolanie konstruktora klasy nadrzednej (tutaj wywolaj konstruktor Player(String name) )
    }
    @Override
    public int guess() {
        System.out.println("Wpisz liczbe: ");
        return input.nextInt();
    }
}
