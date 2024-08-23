package homeworkMMOGame;

import homeworkMMOGame.character.Player;

public abstract class BattleLocation extends Location{
    public Obstackle obstackle;
    public BattleLocation(Player player,Obstackle obstackle){
        super(player);
        Location.setOnLocation(normalLoc.NULL);
    }

    @Override
    public boolean onLocation(){
        return true;
    }
}
