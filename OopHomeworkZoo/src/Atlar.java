public class Atlar extends Hayvanlar {
    
    public Atlar(int age,int agirlik){
        super.setClassName("Atlar");
        super.setAge(age);
        super.setAgirlik(agirlik);
    }
    @Override
    public void getDosage(){
        System.out.print("At için doz: ");
        System.out.println((super.getAge()*100)*super.getAgirlik());
    }
    @Override
    public void getFeedSchedule(){
        System.out.println(super.getClassName()+ " için beslenme sabah ve akşam");
    }
}
