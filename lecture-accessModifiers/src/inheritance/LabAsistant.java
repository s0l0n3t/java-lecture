package inheritance;

public class LabAsistant extends Asistant{

    public LabAsistant(String nameFirst, String email,int phone, String department, String title, String officeStartHours){
        super(nameFirst, email, phone, department, title, officeStartHours);
    }
    public String enterLab(){
        return this.getTitle() + " "+ this.getNameFirst()+ " entered to "+ this.getDepartment()+" lecture lab";
    }
}
