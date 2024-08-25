package homeworkMMOGame.character;

public abstract class PlayerTemplate {
    private String nickname;
    private int damage;
    private int health;
    private int money;
    private Characters selectedCharacter;
    private int stdHealth = 0;
    public enum Characters{
        SAMURAI,
        BOWER,
        KNIGHT
    }
    public abstract void selectCharacter(Player.Characters characters);
    public int getStdHealth() {
        return stdHealth;
    }

    public void setStdHealth(int stdHealth) {
        this.stdHealth = stdHealth;
    }

    public void setSelectedCharacter(Characters selectedCharacter) {
        this.selectedCharacter = selectedCharacter;
    }
    public Characters getSelectedCharacter() {
        return selectedCharacter;
    }
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
