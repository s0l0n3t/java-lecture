package homeworkMMOGame;

import homeworkMMOGame.character.Player;
import homeworkMMOGame.character.PlayerTemplate;

import java.util.Scanner;

public class game {

    public static void main(String[] args) {
        PlayerDialog dialog = new PlayerDialog();
        Scanner dialogScanner = new Scanner(System.in);
        System.out.println(dialog.getStartMenu());
        if(dialogScanner.nextLine().equals("C")){
            System.out.print("Nickname > ");
            Player playerObject = new Player(dialogScanner.nextLine());
            System.out.println(playerObject.getNickname() +" was born in MMO World.");
            System.out.println(dialog.getCharacterList());
            System.out.print("> ");
            switch (dialogScanner.nextInt()){
                case 1:
                    playerObject.selectCharacter(Player.Characters.BOWER);
                    System.out.println("selected: "+playerObject.getSelectedCharacter());
                    System.out.println(playerObject.getHealth());
                    break;
                case 2:
                    playerObject.selectCharacter(Player.Characters.KNIGHT);
                case 3:
                    playerObject.selectCharacter(Player.Characters.SAMURAI);
                    break;
            }

            while (playerObject.getHealth() > 0){
                //game actions
                System.out.println(dialog.getMainMenu(playerObject));
                switch (dialogScanner.nextLine()){
                    case "1":
                        //dark place
                        break;
                    case "2":
                        // safe place
                        break;
                    case "3":
                        //battle places
                        break;
                    case "4":
                        System.out.println(dialog.getInventory(playerObject));
                        break;
                }
            }
        }
        System.out.println("Game Over !");

    }

}
