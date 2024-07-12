public class Kedigiller extends Hayvanlar{


    public Kedigiller(int age,int agirlik){
        super.setAge(age);
        super.setAgirlik(agirlik);
        super.setClassName("Kedigiller");
    }
    public void getDosage(){
        System.out.print("Kedigiller için doz: ");
        int calculatedDosage = (super.getAge()*100)*super.getAgirlik();
        System.out.println(calculatedDosage);
    }
    public void getFeedSchedule(){
        System.out.println(super.getClassName()+ " için beslenme sabah, öğle ve akşam");
    }
}
