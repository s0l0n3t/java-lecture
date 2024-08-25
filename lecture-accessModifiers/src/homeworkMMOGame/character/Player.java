package homeworkMMOGame.character;


public class Player extends PlayerTemplate{



    public Player(String nickname){
        super();
        this.setNickname(nickname);
        //Create location object
    }


    @Override
    public void selectCharacter(Characters characters){
        if(characters.equals(Characters.KNIGHT)){
            this.setDamage(8);
            this.setHealth(24);
            this.setMoney(5);
            this.setStdHealth(24);
            this.setSelectedCharacter(Characters.KNIGHT);
            Inventory.setWeaponName("HAND");
            Inventory.setWeaponDamage(0);
            Inventory.setArmourDefence(0);
        } if (characters.equals(Characters.BOWER)) {
            this.setMoney(20);
            this.setHealth(18);
            this.setDamage(7);
            this.setStdHealth(18);
            this.setSelectedCharacter(Characters.BOWER);
            Inventory.setWeaponName("HAND");
            Inventory.setWeaponDamage(0);
            Inventory.setArmourDefence(0);
        }
        if (characters.equals(Characters.SAMURAI)){
            this.setDamage(5);
            this.setHealth(21);
            this.setMoney(15);
            this.setStdHealth(21);
            this.setSelectedCharacter(Characters.SAMURAI);
            Inventory.setWeaponName("HAND");
            Inventory.setWeaponDamage(0);
            Inventory.setArmourDefence(0);
        }
    }
}
