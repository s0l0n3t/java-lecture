package homeworkMMOGame;

import homeworkMMOGame.character.Inventory;
import homeworkMMOGame.character.Player;
import homeworkMMOGame.character.PlayerTemplate;

import java.util.Scanner;

public class game {

    public static void main(String[] args) {
        PlayerDialog dialog = new PlayerDialog();
        Scanner dialogScanner = new Scanner(System.in);
        System.out.println(dialog.getStartMenu());
        if(dialogScanner.nextLine().toLowerCase().equals("c")){
            System.out.print("Nickname > ");
            Player playerObject = new Player(dialogScanner.nextLine());
            System.out.println(playerObject.getNickname() +" was born in MMO World.");
            System.out.println(dialog.getCharacterList());
            System.out.print("> ");
            dialog.creatingCharacter(dialogScanner,playerObject);//Character creating.
            SafeHouse safeHouse = new SafeHouse(playerObject);
            ToolStore toolstore = new ToolStore(playerObject);
            while (playerObject.getHealth() > 0){
                playerObject.setDamage(playerObject.getDamage() + Inventory.getWeaponDamage());
                playerObject.setHealth(playerObject.getHealth() + Inventory.getArmourDefence());
                playerObject.setStdHealth(playerObject.getHealth());
                System.out.println(dialog.getMainMenu(playerObject));
                switch (dialogScanner.nextLine()){
                    case "1":
                        System.out.println(dialog.getToolStoreBanner(playerObject));
                        System.out.println(dialog.getToolStore(playerObject));
                        switch (dialogScanner.nextLine()){
                            case "1":
                                System.out.println(dialog.getToolStoreBanner(playerObject));
                                System.out.println(dialog.getToolStoreBuyWeapon(playerObject,toolstore.getItemValuesMap(),ToolStore.WEAPONS.GUN.name(),ToolStore.WEAPONS.PISTOL.name(),ToolStore.WEAPONS.SWORD.name()));
                                switch (dialogScanner.nextLine()){
                                    case "1":
                                        toolstore.buyMenu(ToolStore.WEAPONS.GUN);
                                        break;
                                    case "2":
                                        toolstore.buyMenu(ToolStore.WEAPONS.PISTOL);
                                        break;
                                    case "3":
                                        toolstore.buyMenu(ToolStore.WEAPONS.SWORD);
                                        break;
                                    case "e":
                                        break;
                                }
                                break;
                            case "2":
                                System.out.println(dialog.getToolStoreBanner(playerObject));
                                System.out.println(dialog.getToolStoreBuyArmor(playerObject,toolstore.getItemValuesMap(),ToolStore.ARMOR.SOFT.name(),ToolStore.ARMOR.MEDIUM.name(),ToolStore.ARMOR.HEAVY.name()));
                                switch (dialogScanner.nextLine()){
                                    case "1":
                                        toolstore.buyMenu(ToolStore.ARMOR.SOFT);
                                        break;
                                    case "2":
                                        toolstore.buyMenu(ToolStore.ARMOR.MEDIUM);
                                        break;
                                    case "3":
                                        toolstore.buyMenu(ToolStore.ARMOR.HEAVY);
                                        break;
                                    case "e":
                                        break;
                                }
                                break;
                            case "3":
                                System.out.println(dialog.getToolStoreBanner(playerObject));
                                System.out.println(dialog.getToolStoreBuySupport(playerObject));
                                switch (dialogScanner.nextLine()){
                                    case "1":
                                        toolstore.buyMenu(ToolStore.SUPPORT.FIREWOOD);
                                        break;
                                    case "2":
                                        toolstore.buyMenu(ToolStore.SUPPORT.FOOD);
                                        break;
                                    case "3":
                                        toolstore.buyMenu(ToolStore.SUPPORT.WATER);
                                        break;
                                    case "e":
                                        break;
                                }
                                break;
                            case "e":
                                break;
                            case "i":
                                System.out.println(dialog.getInventory(playerObject));
                                break;
                        }
                        break;
                    case "2":
                        safeHouse.onLocation();
                        break;
                    case "3":
                        System.out.println(dialog.getBattleDialog(playerObject));
                        switch (dialogScanner.nextLine()){
                            case "1":
                                if(Inventory.isIsFirewood()){
                                    Vampire vampire = new Vampire();
                                    Forest forestLocate = new Forest(playerObject,vampire);
                                    Inventory.setIsFirewood(false);
                                    forestLocate.combat(playerObject,vampire);
                                }
                                else {
                                    System.out.println("No firewood");
                                }
                                break;
                            case "2":
                                if(Inventory.isIsWater()){
                                    Zombie zombie = new Zombie();
                                    River riverLocate = new River(playerObject,zombie);
                                    Inventory.setIsWater(false);
                                    riverLocate.combat(playerObject,zombie);
                                }
                                else {
                                    System.out.println("No water");
                                }
                                break;
                            case "3":
                                if(Inventory.isIsFood()){
                                    Bear bear = new Bear();
                                    Cave caveLocate = new Cave(playerObject,bear);
                                    Inventory.setIsFood(false);
                                    caveLocate.combat(playerObject,bear);
                                }
                                else {
                                    System.out.println("No food");
                                }

                                break;
                            case "i":
                                System.out.println(dialog.getInventory(playerObject));
                                break;
                            case "e":
                                break;
                        }
                        break;
                    case "i":
                        System.out.println(dialog.getInventory(playerObject));
                        break;
                    case "e":
                        break;
                }
            }
        }
        System.out.println("Game Over !");

    }

}
