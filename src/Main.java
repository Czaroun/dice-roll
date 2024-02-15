public class Main {
    public static void main(String[] args) {
//        Game game = new Game(new WinStatics());
        Game game = new Game();
        game.addPlayer(new PlayerComp("Bot_Bob"));
        game.addPlayer(new PlayerComp("Bot_Mark"));

        for (int i = 0; i < 10; i++) {
            game.play();
        }

//        game.stats.print();
    }
}