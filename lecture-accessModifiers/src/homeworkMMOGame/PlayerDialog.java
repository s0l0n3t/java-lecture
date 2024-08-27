package homeworkMMOGame;

import homeworkMMOGame.character.Inventory;
import homeworkMMOGame.character.Player;

import java.util.HashMap;
import java.util.Scanner;


public class PlayerDialog {
    public String getBattleLocation() {
        return """
                    1 - Forest
                    2 - Cave
                    3 - River
                """;
    }
    public final String getIntro() {
        return """
                *******************************
                ***    Welcome to           ***
                ***    Homework MMO         ***
                *******************************
                """;
    }
    public final String getToolStoreBanner(Player player){
        return
                "\n**********************************"+
                "\n**        TOOL STORE            **"+
                "\n"+ this.getPlayerInfo(player)+
                "\n**********************************";

    }
    public final String exitDialog(){
        return """
                \n <E>xit for press -> e
                """;
    }
    public final String getMainMenu(Player player) {
        return this.getPlayerInfo(player)+"\n"+
                    """
                    1 - Dark Market
                    2 - Safe House
                    3 - Battle Places
                    4 - Inventory
                """+
                this.exitDialog();
    }
    public final String getStartMenu() {
        return getIntro() +
                    """
                    <C>reate new character
                    <E>xit
                """;
    }
    public final String getInventory(Player player){
        return this.getPlayerInfo(player) +
                "\nWeapon : "+ Inventory.getWeaponName()+ " Damage : "+ Inventory.getWeaponDamage()
                + "\nArmor :" + Inventory.getArmorName()+ " Protection : "+Inventory.getArmourDefence()
                + "\nBag : "+ Inventory.getItemList()
                + "\nFirewood : "+ Inventory.isIsFirewood()
                + "\nWater : "+ Inventory.isIsWater()
                + "\nFood : "+ Inventory.isIsFood();
    }
    public final String getPlayerInfo(Player player){
        return  "**********************************"+
                "\nHERO : "+player.getNickname() + "   "+
                "\nCharacter : "+player.getSelectedCharacter()+"   "+
                "\nHP : "+ player.getHealth() +
                "\nDamage : "+ player.getDamage()+
                "\nGold : "+ Inventory.getGold()+
                this.getLocation()+
                "\n**********************************"+
                "\nFor inventory press <I>";
    }
    public final String getCharacterList(){
        return " \n1 - "+ Player.Characters.BOWER+
                "\n2 - "+ Player.Characters.KNIGHT+
                "\n3 - "+ Player.Characters.SAMURAI;
    }
    public final String getToolStore(Player player){
        return getToolStoreBanner(player)+
                """       
                \n1 - buy weapons
                2 - buy armor
                3 - buy support
                4 - sell drops"""+
                this.exitDialog();
    }
    public final String getToolStoreBuyWeapon(Player player,HashMap<String, Integer> hashMap, String gunValue,String pistolValue,String swordValue){
        return  getToolStoreBanner(player)+
                "\n1 - GUN "+ hashMap.get(gunValue) +
                "\n2 - PISTOL "+ hashMap.get(pistolValue)+
                "\n3 - SWORD " + hashMap.get(swordValue) +
                this.exitDialog();
    }
    public final String getToolStoreBuyArmor(Player player,HashMap<String,Integer> hashMap,String softValue,String medValue,String heavyValue){
        return getToolStoreBanner(player)+
                "\n1 - Soft Armor "+ hashMap.get(softValue)+
                "\n2 - Medium Armor "+ hashMap.get(medValue)+
                "\n3 - Heavy Armor "+ hashMap.get(heavyValue)+
                this.exitDialog();
    }
    public final String getToolStoreBuySupport(Player player){
        return getToolStoreBanner(player)+
                """
                \n1 - FIREWOOD 2
                2 - FOOD     2
                3 - WATER    2"""+
                this.exitDialog();
    }
    public final String getLocation(){
        if (Location.getOnLocation() != Location.normalLoc.NULL){
            return "\nLocation : "+ Location.getOnLocation();
        } else if (Location.getOnLocationBattle() != Location.battleLoc.NULL) {
            return "\nLocation : "+Location.getOnLocationBattle();
        }
        else {
            return Location.getOnLocation()+
                    "\n "+ Location.getOnLocationBattle();
        }
    }
    public final void creatingCharacter(Scanner dialogScanner,Player playerObject){
        switch (dialogScanner.nextInt()){
            case 1:
                playerObject.selectCharacter(Player.Characters.BOWER);
                break;
            case 2:
                playerObject.selectCharacter(Player.Characters.KNIGHT);
            case 3:
                playerObject.selectCharacter(Player.Characters.SAMURAI);
                break;
        }
    }
    public final String getBattleDialog(Player player){
      return this.getPlayerInfo(player)+"\n"+
              """
              1 - Forest
              2 - River
              3 - Cave
             <I>nventory"""+
              this.exitDialog();
    }
}
