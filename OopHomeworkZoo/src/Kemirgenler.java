public class Kemirgenler extends Hayvanlar{


    public Kemirgenler(int age,int agirlik){
        super.setAge(age);
        super.setAgirlik(agirlik);
        super.setClassName("Kemirgenler");
    }
    @Override
    public void getDosage(){
        System.out.print(super.getClassName()+ " için doz: ");
        int calculatedDosage = (super.getAge()*100)*super.getAgirlik();
        System.out.println(calculatedDosage);
    }
    @Override
    public void getFeedSchedule(){
        System.out.println(super.getClassName()+ " için beslenme sadece akşam");
    }
}
