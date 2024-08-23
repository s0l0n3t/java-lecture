package abstractClass;

public class Employer extends abstractClass{

    public Employer(String firstName,String lastName, int phoneNumber, int id){
        super(firstName,lastName,phoneNumber,id);
    }

    @Override
    public String enter(){
        return this.getFirstName()+" "+ this.getLastName()+" entered";
    }
    @Override
    public String enter(String place){
        return this.getFirstName()+" "+ this.getLastName()+" entered to "+ place;
    }
    @Override
    public String leave(){
        return this.getFirstName()+" "+ this.getLastName()+" left";
    }
    @Override
    public String leave(String place){
        return this.getFirstName()+" "+ this.getLastName()+" left from "+place;
    }
    @Override
    public String eatFood(){
        return this.getFirstName()+" "+ this.getLastName()+" ate something";
    }
    @Override
    public String eatFood(String place){
        return this.getFirstName()+" "+ this.getLastName()+" ate something in "+place;
    }
}
