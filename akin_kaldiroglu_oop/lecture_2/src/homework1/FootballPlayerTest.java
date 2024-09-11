package homework1;

public class FootballPlayerTest {
    public static void main(String[] args) {
        FootballPlayer alex = new FootballPlayer();
        alex.setNo(10);
        alex.setName("Alex De Souza");
        alex.setMinutes(0);
        alex.setInPlay(true);
        alex.setNumberOfGoals(0);

        alex.play(90);
        alex.score();
        alex.score();

        System.out.println("Number of goals Alex scored: "+ alex.getNumberOfGoals()); //number of goals 2
        System.out.println("Alex played totally "+ alex.getMinutes()+ " minutes so far.");
    }
}
