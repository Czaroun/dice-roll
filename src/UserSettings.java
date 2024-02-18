public class UserSettings implements Settings {
    private boolean isMultiplayer;
    @Override
    public void setGameMode(GamePrinter printer, GameScanner scanner) {
        printer.printSingleOrMulti();
        isMultiplayer = scanner.singleOrMulti();

    }
}