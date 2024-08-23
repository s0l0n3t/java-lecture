package homeworkMMOGame;

import homeworkMMOGame.character.Player;

public abstract class Location extends game{
    public Player player;
    public String nickname;
    private static normalLoc onLocation;
    private static battleLoc onLocationBattle;


    public enum normalLoc{
        SAFEHOUSE,
        TOOLSTORE,
        NULL
    }
    public enum battleLoc{
        FOREST,
        CAVE,
        RIVER,
        NULL
    }

    public Location(Player player){
        this.onLocation = normalLoc.SAFEHOUSE;
        this.player = player;
    }

    public static battleLoc getOnLocationBattle() {
        return onLocationBattle;
    }
    public static normalLoc getOnLocation() {
        return onLocation;
    }
    public static void setOnLocation(normalLoc onLocation) {
        Location.onLocation = onLocation;
    }
    public static void setOnLocationBattle(battleLoc onLocationBattle) {
        Location.onLocationBattle = onLocationBattle;
    }

    public abstract boolean onLocation();
}
