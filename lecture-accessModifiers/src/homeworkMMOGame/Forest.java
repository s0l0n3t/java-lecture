package homeworkMMOGame;

import homeworkMMOGame.character.Inventory;
import homeworkMMOGame.character.Player;

import java.util.Scanner;

public class Forest extends BattleLocation{
    private Vampire vampire;

    public Forest(Player player,Obstacle obstacle){
        super(player, obstacle);
        Location.setOnLocationBattle(battleLoc.FOREST);
        Vampire vampire = new Vampire();
    }

    public void combat(Player player,Vampire vampire){
        while(vampire.getMonsterCount() > 0){
            while(vampire.getHealth() >= 0){
                System.out.println(vampire.getName() +" has been spawned count: "+ vampire.getMonsterCount());
                vampire.setHealth((player.getDamage() + Inventory.getWeaponDamage()) - vampire.getHealth());
                System.out.println(player.getNickname() + " attacked to "+ vampire.getName()+". Damage: "+  player.getDamage());
                System.out.println(vampire.getName()+" Monster Health :"+vampire.getHealth());
                player.setHealth(player.getHealth() - vampire.getDamage());
                System.out.println(vampire.getName() + " attacked to "+ player.getNickname()+". Damage: "+vampire.getDamage());
                System.out.println(player.getNickname() + " Player Health: "+ player.getHealth());
            }
            vampire.setMonsterCount(vampire.getMonsterCount() - 1);
            vampire.setHealth(vampire.getStdHealth());
            vampire.takeDrop();
        }
        vampire.setHealth(vampire.getStdHealth());
        vampire.setMonsterCount((int)Math.ceil(Math.random()*3));


    }
}
