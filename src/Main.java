public class Main {
    public static void main(String[] args) {
        GamePrinterPL printer = new GamePrinterPL(); // obiekt od pisania
        GameScanner gameScanner = new GameScanner(); // obiekt od odczytywania danych z konsoli
        printer.printGameWithStatistics();
        Statistics stats = gameScanner.GameWithStatistics(); // obiekt do statystyk

        Game game = new Game(stats); // obiekt gry (ze statystykami lub bez)

        printer.printSingleOrMulti();
        if (gameScanner.singleOrMulti()) { // singleplayer
            printer.printEnterNameSingle();
            String name = gameScanner.EnterNameSingle();
            game.addPlayer(new PlayerHuman(name));
        }
        else { // multiplayer
            /*
            1. lista graczy
            2. opcje: 1. dodaj gracza
                    2   2. dodaj bota
             */
            printer.printMenuMulti(game);

        }

        game.addPlayer(new PlayerComp("Bot_Bob"));
        game.addPlayer(new PlayerComp("Bot_Mark"));

        for (int i = 0; i < 5; i++) {
            game.play();
        }

        gameScanner.close();
        game.stats.print();
    }
}