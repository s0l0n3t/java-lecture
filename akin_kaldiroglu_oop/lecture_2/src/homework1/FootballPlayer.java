package homework1;

public class FootballPlayer {
    private int no;
    private String name;
    private boolean inPlay;
    private int minutes;//kaç dkdır oyunda
    private int numberOfGoals;

    public FootballPlayer(){
    }
    public String getName() {
        return name;
    }
    public int getMinutes() {
        return minutes;
    }

    public int getNo() {
        return no;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInPlay(boolean inPlay) {
        this.inPlay = inPlay;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }

    public void play(int minutesToPlay){
        this.minutes = minutesToPlay;
    }
    public void score(){
        this.numberOfGoals++;
    }


}
