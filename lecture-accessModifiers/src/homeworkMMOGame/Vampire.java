package homeworkMMOGame;

public class Vampire extends Obstacle {

    public Vampire(){
        this.setName("Vampire");
        this.setHealth(14);
        this.setStdHealth(14);
        this.setDamage(4);
        this.setMonsterCount((int)Math.ceil(Math.random()*3));
        this.setGold(7);
    }


}
