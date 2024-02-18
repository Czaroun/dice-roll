public interface Statistics {
    void addPlayer(Player player);
    void updatePlayer(Player player);
    void removePlayer(String name);
    void print(GamePrinter printer);
}
