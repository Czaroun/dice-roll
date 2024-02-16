public class Main {
    public static void main(String[] args) {
        GamePrinterPL printer = new GamePrinterPL();
        GameScanner gameScanner = new GameScanner();
        printer.printGameWithStatistics();

        Game game = new Game(gameScanner.GameWithStatistics());
//        Game game = new Game(new WinStatistics());
//        Game game = new Game();
        game.addPlayer(new PlayerComp("Bot_Bob"));
        game.addPlayer(new PlayerComp("Bot_Mark"));

        for (int i = 0; i < 10; i++) {
            game.play();
        }

        game.stats.print();
    }
}