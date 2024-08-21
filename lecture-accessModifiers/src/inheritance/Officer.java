package inheritance;
//Second inheritanced class
public class Officer extends Employer{
    private final Officer.workingTime workingTime;
    private String department;

    public enum workingTime{
        EARLY,
        LATE
    }

    public Officer(String nameFirst, String email,int phone,String department,workingTime workingTime){        super(nameFirst,email,phone);
        this.department = department;
        this.workingTime = workingTime;
    }

    public String getDepartment() {
        return department;
    }
    public Officer.workingTime getWorkingTime() {
        return workingTime;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public String work(){
        return this.getNameFirst() + " is working now.";
    }
    
}
