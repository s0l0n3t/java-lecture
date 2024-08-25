package homeworkMMOGame;

import homeworkMMOGame.character.Inventory;
import homeworkMMOGame.character.Player;

import java.util.Scanner;

public class River extends BattleLocation{
    public Zombie zombie;
    public River(Player player, Obstacle obstacle){
        super(player, obstacle);
        Location.setOnLocationBattle(battleLoc.RIVER);
        zombie = new Zombie();
    }
    @Override
    public void combat(){
        int answer = 0;
        while(zombie.getMonsterCount() == 0 || answer == 2){
            if (zombie.getHealth() != 0 || player.getHealth() != 0){
                while (zombie.getHealth() == 0 || player.getHealth() == 0){
                    System.out.println(this.zombie.getName() +" has been spawned count: "+ zombie.getMonsterCount());
                    zombie.setHealth((player.getDamage() + Inventory.getWeaponDamage()) - zombie.getHealth());
                    System.out.println(zombie.getName()+" Monster Health :"+this.zombie.getHealth());
                    player.setHealth(player.getHealth() - zombie.getDamage());
                    System.out.println(player.getNickname() + " Player Health: "+ player.getHealth());
                }
            }
            if (zombie.getHealth() == 0){
                zombie.takeDrop();
                zombie.setMonsterCount(zombie.getMonsterCount() - 1);
                zombie.setHealth(zombie.getStdHealth());
            }
            if(player.getHealth() == 0){
                System.out.println(player.getNickname()+" died by "+ zombie.getName());
                System.out.println("Zombie's health left : "+ zombie.getHealth());
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to continue ? [1- Yes, 2- No]");
            System.out.println("> ");
            answer = sc.nextInt();
        }
    }


}
