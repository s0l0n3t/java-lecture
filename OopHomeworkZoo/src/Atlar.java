public class Atlar extends Hayvanlar {
    
    public Atlar(int age,int agirlik){
        this.setClassName("Atlar");
        this.setAge(age);
        this.setAgirlik(agirlik);
    }
    @Override
    public void getDosage(){
        System.out.print("At için doz: ");
        System.out.println((getAge()*100)*getAgirlik());
    }
    @Override
    public void getFeedSchedule(){
        System.out.println(this.getClassName()+ " için beslenme sabah ve akşam");
    }
}
