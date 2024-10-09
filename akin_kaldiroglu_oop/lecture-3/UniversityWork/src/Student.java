import com.sun.source.tree.UsesTree;

public class Student {
    private String no;
    private String name;
    private String dob;
    public Department department;
    public Professor professor;
    public Course[] coursesTaken;

    public Student(String no,String name){
        this.no = no;
        this.name =name;

    }

    public Professor getProfessor() {
        return professor;
    }

    public Department getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public Course[] getCoursesTaken() {
        return coursesTaken;
    }

    public String getDob() {
        return dob;
    }

    public String getNo() {
        return no;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    public void setNo(String no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
