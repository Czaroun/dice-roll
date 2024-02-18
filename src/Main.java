public class Main {
    public static void main(String[] args) {
        GamePrinterPL printer = new GamePrinterPL(); // obiekt od pisania
        GameScanner gameScanner = new GameScanner(); // obiekt od odczytywania danych z konsoli

        printer.printGameWithSettings();
        Settings settings = gameScanner.gameWithSettings(); // obiekt ustawien

        printer.printGameWithStatistics();
        Statistics stats = gameScanner.gameWithStatistics(); // obiekt statystyk

        Game game = new Game(settings, stats); // obiekt gry
        game.config(game, printer, gameScanner); // konfiguracja ustawien

        for (int i = 0; i < game.settings.getRounds(); i++) {
            game.play(printer, gameScanner);
        }

        gameScanner.close();
        game.stats.print(printer);
    }
}