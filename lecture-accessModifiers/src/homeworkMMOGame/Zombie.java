package homeworkMMOGame;

public class Zombie extends Obstacle{

    public Zombie(){
        this.setName("Zombie");
        this.setHealth(10);
        this.setStdHealth(10);
        this.setDamage(3);
        this.setMonsterCount((int)Math.ceil(Math.random()*3));
        this.setGold(4);
    }
}
