package homeworkMMOGame;

public abstract class Obstackle {
    private int health;
    private String name;
    private int damage;
    private int monsterCount;
    private final String[] ITEMS = {"GUN","PISTOL","SWORD","SOFT_ARMOR","MEDIUM_ARMOR","HEAVY_ARMOR"};
    public abstract void itemDrop();
    public abstract void monsterSpawn();

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
}
