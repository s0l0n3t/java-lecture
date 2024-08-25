package homeworkMMOGame;

public class Bear extends Obstacle{
    public Bear(){
        this.setName("Bear");
        this.setHealth(20);
        this.setStdHealth(20);
        this.setDamage(7);
        this.setMonsterCount((int)Math.ceil(Math.random()*3));
        this.setGold(12);
    }
}
