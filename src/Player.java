import java.util.Random;

abstract public class Player {
    private Random brain = new Random();
    private String name = "NoName";
    public Player() {}
    public Player(String name) {
        setName(name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        // imie moze skladac sie z malych i duzych znakow, cyfr i znakow . \ - _ , min. 3 znaki
        if (name != null && name.matches("^[A-Za-z0-9.\\-_]{3,}$")) {
            this.name = name;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
    abstract public int guess(); // metoda abstrakcyjna do zaimplementowania w klasach dziedziczacych
}
