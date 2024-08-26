package homeworkMMOGame;

import homeworkMMOGame.character.Inventory;

public class Obstacle {
    private int health;
    private String name;
    private int damage;
    private int monsterCount;
    private final String[] ITEMS = {"GUN","PISTOL","SWORD","SOFT_ARMOR","MEDIUM_ARMOR","HEAVY_ARMOR"};
    private int gold;
    private int stdHealth;
    public void takeDrop(){
        if((int)Math.ceil(Math.random()*100) >= 10){
            Inventory.addItem(ITEMS[(int)Math.ceil(Math.random()*5)]);
            System.out.println("\n\n\n\nYou dropped an item !");
            System.out.println("You dropped an item !");
            System.out.println("You dropped an item !");
            System.out.println("You dropped an item !");
            //when %10 luck begun get random item.
        }
        Inventory.setGold(Inventory.getGold() + this.getGold());
    }//call when health = 0

    public void setStdHealth(int stdHealth) {
        this.stdHealth = stdHealth;
    }
    public int getStdHealth() {
        return stdHealth;
    }
    public int getHealth() {
        return health;
    }
    public int getDamage() {
        return damage;
    }
    public String getName() {
        return name;
    }
    public int getMonsterCount() {
        return monsterCount;
    }
    public void setMonsterCount(int monsterCount) {
        this.monsterCount = monsterCount;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGold() {
        return gold;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }
}
