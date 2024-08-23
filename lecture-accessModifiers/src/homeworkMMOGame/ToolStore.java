package homeworkMMOGame;

import homeworkMMOGame.character.Inventory;
import homeworkMMOGame.character.Player;

public class ToolStore extends NormalLocation{

    //CONSTRUCTOR
    public ToolStore(Player player){
        super(player);
    }
    public enum WEAPONS{
        PISTOL,
        SWORD,
        GUN
    }
    public enum ARMOR{
        SOFT,
        MEDIUM,
        HEAVY
    }
    public enum SUPPORT{
        FOOD,
        FIREWOOD,
        WATER
    }
    public void buyMenu(WEAPONS weapons){
        if(weapons.equals(WEAPONS.GUN)){
            if(player.getMoney() >= 45){
                player.setMoney(player.getMoney() - 45);
                Inventory.setWeaponName(weapons.name());
                Inventory.setWeaponDamage(7);
            }
            else{
                System.out.println("Not enough money !");
            }
        }
        else if(weapons.equals(WEAPONS.PISTOL)){
            if(player.getMoney() >= 25){
                player.setMoney(player.getMoney()-25);
                Inventory.setWeaponName(weapons.name());
                Inventory.setWeaponDamage(2);
            }
            else{
                System.out.println("Not enough money !");
            }
        } else if (weapons.equals(WEAPONS.SWORD)) {
            if(player.getMoney() >= 35){
                player.setMoney(player.getMoney()-35);
                Inventory.setWeaponName(weapons.name());
                Inventory.setWeaponDamage(3);
            }
            else {
                System.out.println("Not enough money !");
            }
        }
        else {
            System.out.println("You didn't buy anything.");
        }


    }
    public void buyMenu(ARMOR armor){
        if(armor.equals(ARMOR.SOFT)){
            if(player.getMoney() >= 15){
                Inventory.setArmorName(armor.name());
                Inventory.setArmourDefence(1);
                player.setMoney(player.getMoney()-15);
            }
            else{
                System.out.println("Not enough money !");
            }
        }
        else if(armor.equals(ARMOR.MEDIUM)){
            if(player.getMoney() >= 25){
                Inventory.setArmorName(armor.name());
                Inventory.setArmourDefence(3);
                player.setMoney(player.getMoney()-25);
            }
            else{
                System.out.println("Not enough money !");
            }
        }
        else if(armor.equals(ARMOR.HEAVY)){
            if(player.getMoney() >= 40){
                Inventory.setArmorName(armor.name());
                Inventory.setArmourDefence(5);
                player.setMoney(player.getMoney()-45);
            }
            else{
                System.out.println("Not enough money !");
            }
        }
        else {
            System.out.println("You didn't buy anything.");
        }
    }
    public void buyMenu(SUPPORT support){
        if(support.equals(SUPPORT.FIREWOOD)){
            if(player.getMoney() >= 2 && !Inventory.isIsFirewood()){
                player.setMoney(player.getMoney() - 2);//price 2
                Inventory.setIsFirewood(true);
            }
            else {
                System.out.println("You can't buy firewood");
            }
        } else if (support.equals(SUPPORT.FOOD)) {
            if(player.getMoney() >= 2 && !Inventory.isFood()){
                player.setMoney(player.getMoney() - 2);
                Inventory.setIsFood(true);
            }
            else {
                System.out.println("You can't buy firewood");
            }
        } else if (support.equals(SUPPORT.WATER)) {
            if(player.getMoney() >= 2 && !Inventory.isIsWater()){
                player.setMoney(player.getMoney() - 2);
                Inventory.setIsWater(true);
            }
        }
        else {
            System.out.println("You didn't buy anything.");
        }

    }
    public void sellMenu(){
        //sell menu
    }


    @Override
    public boolean onLocation(){
        Location.setOnLocation(normalLoc.TOOLSTORE);
        Location.setOnLocationBattle(battleLoc.NULL);
        System.out.println("""
                Hello, this place is Tool Store.
                You can buy weapon, armor and support items.
                1 - buy weapons
                2 - buy armor
                3 - buy support
                """);
        //add scanner on game class
        return true;
    }
}
