import java.util.Date;

public class Course {
    private String code;
    private String name;
    public Department department;
    public Professor professor;
    public Student[] students;
    private String[] days;
    public Date time;

    public Course(String code,String name){
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Date getTime() {
        return time;
    }

    public Department getDepartment() {
        return department;
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getCode() {
        return code;
    }

    public String[] getDays() {
        return days;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setDays(String[] days) {
        this.days = days;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
