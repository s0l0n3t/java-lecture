package homeworkMMOGame;

import homeworkMMOGame.character.Inventory;
import homeworkMMOGame.character.Player;


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
    public final String getMainMenu(Player player) {
        return this.getPlayerInfo(player)+"\n"+
                    """
                    1 - Dark Market
                    2 - Safe Place
                    3 - Battle Places
                    4 - Inventory
                """;
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
                "\nWeapon : "+ Inventory.getWeaponName()
                + "\nArmor :" + Inventory.getArmorName()
                + "\nBag : "+ Inventory.getItemList()
                + "\nFirewood : "+ Inventory.isIsFirewood()
                + "\nWater : "+ Inventory.isIsWater()
                + "\nFood : "+ Inventory.isIsFood();
    };
    public final String getPlayerInfo(Player player){
        return  "**********************************"+
                "\nHERO : "+player.getNickname() + "   "+
                "\nCharacter : "+player.getSelectedCharacter()+"   "+
                "\nHP : "+ player.getHealth() +
                "\nDamage : "+ player.getDamage()+
                "\nGold : "+ player.getMoney()+
                "\n**********************************";
    }
    public final String getCharacterList(){
        return " \n1 - "+ Player.Characters.BOWER+
                "\n2 - "+ Player.Characters.KNIGHT+
                "\n3 - "+ Player.Characters.SAMURAI;
    }
    public final String getToolStore(){
        return "";
    }

}
