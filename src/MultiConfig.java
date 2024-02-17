public class MultiConfig {
    public void addPlayerHuman(Game game, GamePrinter printer, GameScanner gameScanner) {
        printer.printEnterNameMulti();
        game.addPlayer(new PlayerHuman(gameScanner.enterName()));
    }
    public void addPlayerComp(Game game) {
        game.addPlayer(new PlayerComp("Bot"));
    }
}
