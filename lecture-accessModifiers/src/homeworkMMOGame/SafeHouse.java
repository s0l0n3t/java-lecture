package homeworkMMOGame;

import homeworkMMOGame.character.Player;

public class SafeHouse extends NormalLocation{

    public SafeHouse(Player player){
        super(player);
    }
    @Override
    public boolean onLocation(){
        Location.setOnLocation(normalLoc.SAFEHOUSE);
        Location.setOnLocationBattle(battleLoc.NULL);
        System.out.println("Character got health");
        this.player.setHealth(player.getStdHealth());//getting health
        return true;
    }
}
