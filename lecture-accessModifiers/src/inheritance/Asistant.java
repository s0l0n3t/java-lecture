package inheritance;

public class Asistant extends Academician{
    private String officeStartHours;
    public Asistant(String nameFirst,String email,int phone, String department,String title,String officeStartHours){
        super(nameFirst, email, phone, department, title);
        this.officeStartHours = officeStartHours;
    }

    public String getOfficeStartHours() {
        return officeStartHours;
    }

    public void setOfficeStartHours(String officeStartHours) {
        this.officeStartHours = officeStartHours;
    }

    public String makeQuiz(){
        return this.getTitle() + " "+ this.getNameFirst()+ " made an "+ this.getDepartment()+ " quiz";
    }
}
