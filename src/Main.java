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
            String name = gameScanner.enterName();
            game.addPlayer(new PlayerHuman(name));
        }
        else { // multiplayer
            boolean startGame = true;
            do {
                printer.printMenuMulti(game);
                startGame = gameScanner.menuMulti(game, printer);

            }
            while (startGame);

            /*
            TO DO:
                - dodać opcje usuwanie graczy - MultiConfig.java
                - zmodyfikować game.play() - gracz ma podać ile rund chce zagrać
                - osobny licznik dla botów
                * wyjątki
             */


        }
        printer.printHowManyRounds();
        game.setRounds(gameScanner.enterNumber());
        for (int i = 0; i < game.getRounds(); i++) {
            game.play(printer, gameScanner);
        }

        gameScanner.close();
        game.stats.print(printer);
    }
}