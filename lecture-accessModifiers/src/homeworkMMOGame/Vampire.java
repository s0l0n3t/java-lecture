package homeworkMMOGame;

public class Vampire extends Obstackle{

    public Vampire(){
        this.setName("Vampire");
        this.setHealth(10);
        this.setDamage((int)Math.ceil(Math.random()*5));
        this.setMonsterCount((int)Math.ceil(Math.random()*3));
    }
    public void itemDrop(){
        if((int)Math.ceil(Math.random()*100) == 10){
            switch ((int)Math.ceil(Math.random()*100)){
                case 1:
                    break;

                case 2:
                    break;

            }
        }
    }
    public void monsterSpawn(){

    }
}
