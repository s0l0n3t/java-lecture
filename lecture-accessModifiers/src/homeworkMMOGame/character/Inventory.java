package homeworkMMOGame.character;

import java.util.List;

public class Inventory {
    private Player player;
    private static boolean food;
    private static String weaponName;
    private static String armorName;
    private static int weaponDamage;
    private static int armourDefence;
    private static boolean isWater;
    private static boolean isFirewood;
    private static boolean isFood;
    public static List<String> itemList;
    private static int gold;

    public static void setGold(int gold) {
        Inventory.gold = gold;
    }
    public static int getGold() {
        return gold;
    }
    public static int getArmourDefence() {
        return armourDefence;
    }
    public static int getWeaponDamage() {
        return weaponDamage;
    }
    public static String getArmorName() {
        return armorName;
    }
    public static String getWeaponName() {
        return weaponName;
    }
    public static boolean isFood() {
        return food;
    }
    public static boolean isIsFirewood() {
        return isFirewood;
    }
    public static boolean isIsFood() {
        return isFood;
    }
    public static boolean isIsWater() {
        return isWater;
    }
    public static void setItemList(List<String> itemList) {
        Inventory.itemList = itemList;
    }

    public static void setArmorName(String armorName) {
        Inventory.armorName = armorName;
    }
    public static void setArmourDefence(int armourDefence) {
        Inventory.armourDefence = armourDefence;
    }
    public static void setFood(boolean food) {
        Inventory.food = food;
    }
    public static void setWeaponDamage(int weaponDamage) {
        Inventory.weaponDamage = weaponDamage;
    }
    public static void setWeaponName(String weaponName) {
        Inventory.weaponName = weaponName;
    }
    public static void setIsFirewood(boolean isFirewood) {
        Inventory.isFirewood = isFirewood;
    }
    public static void setIsFood(boolean isFood) {
        Inventory.isFood = isFood;
    }
    public static void setIsWater(boolean isWater) {
        Inventory.isWater = isWater;
    }
    public static List<String> getItemList() {
        return itemList;
    }
    public static void addItem(String item){
        itemList.add(item);
        //add control for security.
    }
}
