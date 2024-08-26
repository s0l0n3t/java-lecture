package homeworkMMOGame;

import homeworkMMOGame.character.Inventory;
import homeworkMMOGame.character.Player;


public class Cave extends BattleLocation{
    private Bear bear;

    public Cave(Player player, Obstacle obstacle){
        super(player, obstacle);
        Location.setOnLocationBattle(battleLoc.CAVE);
        Bear bear = new Bear();
    }


    public void combat(Player player,Bear bear){
        while(bear.getMonsterCount() > 0){
            while(bear.getHealth() >= 0){
                System.out.println(bear.getName() +" has been spawned count: "+ bear.getMonsterCount());
                bear.setHealth((player.getDamage() + Inventory.getWeaponDamage()) - bear.getHealth());
                System.out.println(player.getNickname() + " attacked to "+ bear.getName()+". Damage: "+  player.getDamage());
                System.out.println(bear.getName()+" Monster Health :"+bear.getHealth());
                player.setHealth(player.getHealth() - bear.getDamage());
                System.out.println(bear.getName() + " attacked to "+ player.getNickname()+". Damage: "+bear.getDamage());
                System.out.println(player.getNickname() + " Player Health: "+ player.getHealth());
            }
            bear.setMonsterCount(bear.getMonsterCount() - 1);
            bear.setHealth(bear.getStdHealth());
            bear.takeDrop();
        }
        bear.setHealth(bear.getStdHealth());
        bear.setMonsterCount((int)Math.ceil(Math.random()*3));
    }
}
