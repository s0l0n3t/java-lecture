package homeworkMMOGame;

import homeworkMMOGame.character.Inventory;
import homeworkMMOGame.character.Player;

import java.util.Scanner;

public class Cave extends BattleLocation{
    public Bear bear;

    public Cave(Player player, Obstacle obstacle){
        super(player, obstacle);
        Location.setOnLocationBattle(battleLoc.CAVE);
        bear = new Bear();
    }

    @Override
    public void combat(){
        int answer = 0;
        while(bear.getMonsterCount() == 0 || answer == 2){
            if (bear.getHealth() != 0 || player.getHealth() != 0){
                while (bear.getHealth() == 0 || player.getHealth() == 0){
                System.out.println(this.bear.getName() +" has been spawned count: "+ bear.getMonsterCount());
                bear.setHealth((player.getDamage() + Inventory.getWeaponDamage()) - bear.getHealth());
                System.out.println(bear.getName()+" Monster Health :"+this.bear.getHealth());
                player.setHealth(player.getHealth() - bear.getDamage());
                System.out.println(player.getNickname() + " Player Health: "+ player.getHealth());}
            }
            if (bear.getHealth() == 0){
                bear.takeDrop();
                bear.setMonsterCount(bear.getMonsterCount() - 1);
                bear.setHealth(bear.getStdHealth());
            }
            if(player.getHealth() == 0){
                System.out.println(player.getNickname()+" died by "+ bear.getName());
                System.out.println("bear's health left : "+ bear.getHealth());
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to continue ? [1- Yes, 2- No]");
            System.out.println("> ");
            answer = sc.nextInt();
        }
    }
}
