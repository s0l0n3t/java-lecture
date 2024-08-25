package homeworkMMOGame;

import homeworkMMOGame.character.Inventory;
import homeworkMMOGame.character.Player;

import java.util.Scanner;

public class Forest extends BattleLocation{
    public Vampire vampire;

    public Forest(Player player,Obstacle obstacle){
        super(player, obstacle);
        Location.setOnLocationBattle(battleLoc.FOREST);
        vampire = new Vampire();
    }
    @Override
    public void combat(){
        int answer = 0;
        while(vampire.getMonsterCount() == 0 || answer == 2){
            if (vampire.getHealth() != 0 || player.getHealth() != 0){
                while (vampire.getHealth() == 0 || player.getHealth() == 0){
                System.out.println(this.vampire.getName() +" has been spawned count: "+ vampire.getMonsterCount());
                vampire.setHealth((player.getDamage() + Inventory.getWeaponDamage()) - vampire.getHealth());
                System.out.println(vampire.getName()+" Monster Health :"+this.vampire.getHealth());
                player.setHealth(player.getHealth() - vampire.getDamage());
                System.out.println(player.getNickname() + " Player Health: "+ player.getHealth());}
            }
            if (vampire.getHealth() == 0){
                vampire.takeDrop();
                vampire.setMonsterCount(vampire.getMonsterCount() - 1);
                vampire.setHealth(vampire.getStdHealth());
            }
            if(player.getHealth() == 0){
                System.out.println(player.getNickname()+" died by "+ vampire.getName());
                System.out.println("Vampire's health left : "+ vampire.getHealth());
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to continue ? [1- Yes, 2- No]");
            System.out.println("> ");
            answer = sc.nextInt();
        }
    }
}
