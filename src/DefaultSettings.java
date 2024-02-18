public class DefaultSettings implements Settings {
    private boolean isMultiplayer;
    @Override
    public void setGameMode(GamePrinter printer, GameScanner scanner) {
        this.isMultiplayer = true;
    }
}
