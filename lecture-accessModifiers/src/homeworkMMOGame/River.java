package homeworkMMOGame;

import homeworkMMOGame.character.Inventory;
import homeworkMMOGame.character.Player;


public class River extends BattleLocation{
    private Zombie zombie;
    public River(Player player, Obstacle obstacle){
        super(player, obstacle);
        Location.setOnLocationBattle(battleLoc.RIVER);
        Zombie zombie = new Zombie();
    }

    public void combat(Player player,Zombie zombie){
        while(zombie.getMonsterCount() > 0){
            while(zombie.getHealth() >= 0){
                System.out.println(zombie.getName() +" has been spawned count: "+ zombie.getMonsterCount());
                zombie.setHealth((player.getDamage() + Inventory.getWeaponDamage()) - zombie.getHealth());
                System.out.println(player.getNickname() + " attacked to "+ zombie.getName()+". Damage: "+  player.getDamage());
                System.out.println(zombie.getName()+" Monster Health :"+zombie.getHealth());
                player.setHealth(player.getHealth() - zombie.getDamage());
                System.out.println(zombie.getName() + " attacked to "+ player.getNickname()+". Damage: "+zombie.getDamage());
                System.out.println(player.getNickname() + " Player Health: "+ player.getHealth());
            }
            zombie.setMonsterCount(zombie.getMonsterCount() - 1);
            zombie.setHealth(zombie.getStdHealth());
            zombie.takeDrop();
        }
        zombie.setHealth(zombie.getStdHealth());
        zombie.setMonsterCount((int)Math.ceil(Math.random()*3));
    }
}
