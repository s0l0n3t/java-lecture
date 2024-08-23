package homeworkMMOGame.character;

public abstract class PlayerTemplate {
    private String nickname;
    private int damage;
    private int health;
    private int money;

    public abstract void selectCharacter(Player.Characters characters);
    public abstract void showInventory();
    public abstract void pickDrops();

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getMoney() {
        return money;
    }

    public String getNickname() {
        return nickname;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
