public class Match {
    Fighter fighter1;
    Fighter fighter2;

    
    Match(Fighter fighter1, Fighter fighter2){
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;

    }
boolean isPlayer(Fighter player,Fighter foe){
        double playerRand = Math.random() * 100;
        double foeRand = Math.random() * 100;
        if (playerRand > foeRand){
            return true;
        }
        else{
            
            return false;
        }
        
        
    }

void run(){
    // Rastgele önce başlama fonksiyonu eklendi.
    while(fighter1.fightHealth > 0 && fighter2.fightHealth > 0){
        if(isPlayer(fighter1, fighter2) == true){
            System.out.println(fighter1.fightName+ " HITS !");
            fighter1.hit(fighter2);
            System.out.println(fighter1.fightName+" Kicked "+fighter1.damage+ " Damage ! " + fighter1.fightHealth);
            fighter2.hit(fighter1);
            System.out.println(fighter2.fightName+" Kicked "+fighter2.damage+ " Damage ! " + fighter2.fightHealth);
        }
        else{
            System.out.println(fighter2.fightName+ " HITS !");
            fighter2.hit(fighter1);
            System.out.println(fighter2.fightName+" Kicked "+fighter2.damage+ " Damage ! " + fighter2.fightHealth);
            fighter1.hit(fighter2);
            System.out.println(fighter1.fightName+" Kicked "+fighter1.damage+ " Damage ! " + fighter1.fightHealth);
        }
        
    }
    if(fighter1.fightHealth > 0){
        System.out.println(fighter1.fightName + " Won !");
    }
    else{
        System.out.println(fighter2.fightName + " Won !");
    }
}

}
