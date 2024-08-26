package homeworkMMOGame;

import homeworkMMOGame.character.Player;

public abstract class BattleLocation extends Location{
    public Obstacle obstacle;
    public BattleLocation(Player player, Obstacle obstacle){
        super(player);
        Location.setOnLocation(normalLoc.NULL);
    }

    @Override
    public boolean onLocation(){
        return true;
    }

}
