package homeworkMMOGame.character;


public class Player extends PlayerTemplate{
    private int stdHealth = 0;

    public Player(String nickname){
        super();
        this.setNickname(nickname);
        //Create location object
    }
    public enum Characters{
        SAMURAI,
        BOWER,
        KNIGHT
    }

    public void selectCharacter(Characters characters){
        if(characters.equals(Characters.KNIGHT)){
            this.setDamage(8);
            this.setHealth(24);
            this.setMoney(5);
            this.stdHealth = 24;
        } if (characters.equals(Characters.BOWER)) {
            this.setMoney(20);
            this.setHealth(18);
            this.setDamage(7);
            this.stdHealth = 18;
        }
        if (characters.equals(Characters.SAMURAI)){
            this.setDamage(5);
            this.setHealth(21);
            this.setMoney(15);
            this.stdHealth = 21;
        }
        else{
            this.setHealth(0);//For exit the loop
        }
    }

    public void showInventory(){
        System.out.println(Inventory.getArmorName()+ " Defance: "+ Inventory.getArmourDefence());
        System.out.println(Inventory.getWeaponName()+" Damage: "+ Inventory.getWeaponDamage());
        System.out.println("Food: "+Inventory.isFood());
    }
    public void pickDrops(){
        //Pick drops
    }

    public int getStdHealth() {
        return stdHealth;
    }
}
