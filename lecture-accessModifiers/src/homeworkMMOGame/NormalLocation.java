package homeworkMMOGame;

import homeworkMMOGame.character.Player;

public abstract class NormalLocation extends Location{
    public NormalLocation(Player player){
        super(player);
        Location.setOnLocationBattle(battleLoc.NULL);
    }
    @Override
    public boolean onLocation(){
        return true;
    }
}
