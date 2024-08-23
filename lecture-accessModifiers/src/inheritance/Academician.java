package inheritance;

public class Academician extends Employer{
    private String department;
    private String title;

    public Academician(String nameFirst, String email, int phone,String department,String title){
        super(nameFirst,email,phone);
        this.department = department;
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public String getTitle() {
        return title;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String enter(){
        return this.title +" " + this.getNameFirst() + " entered to University";
    }
    @Override
    public String leave(){
        return this.title +" "+ this.getNameFirst() + " left from University";
    }
    public String leave(String place){
        return this.title +" "+ this.getNameFirst() + " left from "+place;
    }
    @Override
    public String foodHouse(){
        return this.title +" "+ this.getNameFirst() + " entered to food house";
    }
    public String enterToLecture(){
        return this.title +" " + this.getNameFirst() + " entered to "+ this.department + " lecture";
    }
}
