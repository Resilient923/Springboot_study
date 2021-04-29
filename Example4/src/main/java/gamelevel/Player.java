package gamelevel;

public class Player {
    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    private PlayerLevel level;

    public Player(){
        level = new BegginnerLevel();
        level.showLevelMessage();
    }

    public void play(int count) {
        level.go(count);
    }
}
