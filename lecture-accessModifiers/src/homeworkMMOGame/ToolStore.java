package homeworkMMOGame;

import homeworkMMOGame.character.Inventory;
import homeworkMMOGame.character.Player;

import java.util.HashMap;

public class ToolStore extends NormalLocation{
    private final HashMap<String, Integer>itemValuesMap = new HashMap<String, Integer>();

    //CONSTRUCTOR
    public ToolStore(Player player){
        super(player);
        itemValuesMap.put(WEAPONS.GUN.name(),45);
        itemValuesMap.put(WEAPONS.SWORD.name(),20);
        itemValuesMap.put(WEAPONS.PISTOL.name(),35);
        itemValuesMap.put(ARMOR.SOFT_ARMOR.name(),15);
        itemValuesMap.put(ARMOR.MEDIUM_ARMOR.name(),20);
        itemValuesMap.put(ARMOR.HEAVY_ARMOR.name(),40);
    }
    public enum WEAPONS{
        PISTOL,
        SWORD,
        GUN
    }
    public enum ARMOR{
        SOFT_ARMOR,
        MEDIUM_ARMOR,
        HEAVY_ARMOR
    }
    public enum SUPPORT{
        FOOD,
        FIREWOOD,
        WATER
    }
    public void buyMenu(WEAPONS weapons){
        if(weapons.equals(WEAPONS.GUN)){
            if(Inventory.getGold() >= itemValuesMap.get(WEAPONS.GUN.name())){
                Inventory.setGold(Inventory.getGold() - itemValuesMap.get(WEAPONS.GUN.name()));
                Inventory.setWeaponName(weapons.name());
                Inventory.setWeaponDamage(7);
            }
            else{
                System.out.println("Not enough money !");
            }
        }
        else if(weapons.equals(WEAPONS.PISTOL)){
            if(Inventory.getGold() >= itemValuesMap.get(WEAPONS.PISTOL.name())){
                Inventory.setGold(Inventory.getGold() - itemValuesMap.get(WEAPONS.PISTOL.name()));
                Inventory.setWeaponName(weapons.name());
                Inventory.setWeaponDamage(5);
            }
            else{
                System.out.println("Not enough money !");
            }
        } else if (weapons.equals(WEAPONS.SWORD)) {
            if(Inventory.getGold() >= itemValuesMap.get(WEAPONS.SWORD.name())){
                Inventory.setGold(Inventory.getGold() - itemValuesMap.get(WEAPONS.SWORD.name()));
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
        if(armor.equals(ARMOR.SOFT_ARMOR)){
            if(Inventory.getGold() >= itemValuesMap.get(ARMOR.SOFT_ARMOR.name())){
                Inventory.setArmorName(armor.name());
                Inventory.setGold(Inventory.getGold() - itemValuesMap.get(ARMOR.SOFT_ARMOR.name()));
                Inventory.setArmourDefence(2);
            }
            else{
                System.out.println("Not enough money !");
            }
        }
        else if(armor.equals(ARMOR.MEDIUM_ARMOR)){
            if(Inventory.getGold() >= itemValuesMap.get(ARMOR.MEDIUM_ARMOR.name())){
                Inventory.setArmorName(armor.name());
                Inventory.setGold(Inventory.getGold() - itemValuesMap.get(ARMOR.MEDIUM_ARMOR.name()));
                Inventory.setArmourDefence(4);
            }
            else{
                System.out.println("Not enough money !");
            }
        }
        else if(armor.equals(ARMOR.HEAVY_ARMOR)){
            if(Inventory.getGold() >= itemValuesMap.get(ARMOR.HEAVY_ARMOR.name())){
                Inventory.setArmorName(armor.name());
                Inventory.setGold(Inventory.getGold() - itemValuesMap.get(ARMOR.HEAVY_ARMOR.name()));
                Inventory.setArmourDefence(7);
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
        for(int i = 0; i< Inventory.getItemList().size();i++){
            if (this.getItemValuesMap().containsKey(Inventory.getItemList().get(i))){
                System.out.println(Inventory.getItemList().get(i) + " item sold for "+ this.getItemValuesMap().get(Inventory.getItemList().get(i)));
                Inventory.setGold(Inventory.getGold() + this.getItemValuesMap().get(Inventory.getItemList().get(i)));
            }
        }
        Inventory.getItemList().clear();
    }


    public HashMap<String, Integer> getItemValuesMap() {
        return itemValuesMap;
    }

    @Override
    public boolean onLocation(){
        Location.setOnLocation(normalLoc.TOOLSTORE);
        Location.setOnLocationBattle(battleLoc.NULL);
        //add scanner on game class
        return true;

    }
}
