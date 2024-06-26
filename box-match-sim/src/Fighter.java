public class Fighter {
    String fightName;
    int fightNumber;
    int damage;
    int fightHealth;
    


    Fighter(String fightName, int fightNumber, int damage, int fightHealth){
        this.fightName = fightName;
        this.fightHealth = fightHealth;
        this.fightNumber = fightNumber;
        this.damage = damage;

    }

    int hit(Fighter foe){
        foe.fightHealth -= this.damage;
        return foe.fightHealth;
    }
    
}
