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
            if(Inventory.getGold() >= 45){
                Inventory.setGold(Inventory.getGold() - 25);
                Inventory.setWeaponName(weapons.name());
                Inventory.setWeaponDamage(7);
            }
            else{
                System.out.println("Not enough money !");
            }
        }
        else if(weapons.equals(WEAPONS.PISTOL)){
            if(Inventory.getGold() >= 25){
                Inventory.setGold(Inventory.getGold() - 25);
                Inventory.setWeaponName(weapons.name());
                Inventory.setWeaponDamage(2);
            }
            else{
                System.out.println("Not enough money !");
            }
        } else if (weapons.equals(WEAPONS.SWORD)) {
            if(Inventory.getGold() >= 35){
                Inventory.setGold(Inventory.getGold() - 35);
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
            if(Inventory.getGold() >= 15){
                Inventory.setArmorName(armor.name());
                Inventory.setArmourDefence(1);
                Inventory.setGold(Inventory.getGold() - 15);
            }
            else{
                System.out.println("Not enough money !");
            }
        }
        else if(armor.equals(ARMOR.MEDIUM)){
            if(Inventory.getGold() >= 25){
                Inventory.setArmorName(armor.name());
                Inventory.setArmourDefence(3);
                Inventory.setGold(Inventory.getGold() - 25);
            }
            else{
                System.out.println("Not enough money !");
            }
        }
        else if(armor.equals(ARMOR.HEAVY)){
            if(Inventory.getGold() >= 40){
                Inventory.setArmorName(armor.name());
                Inventory.setArmourDefence(5);
                Inventory.setGold(Inventory.getGold() - 45);
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
            if(Inventory.getGold() >= 2 && !Inventory.isIsFirewood()){
                Inventory.setGold(Inventory.getGold() - 2);
                Inventory.setIsFirewood(true);
            }
            else {
                System.out.println("You can't buy firewood");
            }
        } else if (support.equals(SUPPORT.FOOD)) {
            if(Inventory.getGold() >= 2 && !Inventory.isFood()){
                Inventory.setGold(Inventory.getGold() - 2);
                Inventory.setIsFood(true);
            }
            else {
                System.out.println("You can't buy firewood");
            }
        } else if (support.equals(SUPPORT.WATER)) {
            if(Inventory.getGold() >= 2 && !Inventory.isIsWater()){
                Inventory.setGold(Inventory.getGold() - 2);
                Inventory.setIsWater(true);
            }
        }
        else {
            System.out.println("You didn't buy anything.");
        }

    }
    public void sellMenu(){
        //sell menu
        //user hashmap for inventory
    }


    @Override
    public boolean onLocation(){
        Location.setOnLocation(normalLoc.TOOLSTORE);
        Location.setOnLocationBattle(battleLoc.NULL);
        //add scanner on game class
        return true;
    }
}
