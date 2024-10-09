public class Professor {
    private String no;
    private String name;
    private String rank;
    public Department department;
    public Student[] advisee;
    public Course[] coursesGiven;

    public Professor(String no,String name,String rank){
        this.no = no;
        this.name = name;
        this.rank = rank;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Student[] getAdvisee() {
        return advisee;
    }

    public void setAdvisee(Student[] advisee) {
        this.advisee = advisee;
    }

    public Course[] getCoursesGiven() {
        return coursesGiven;
    }

    public void setCoursesGiven(Course[] coursesGiven) {
        this.coursesGiven = coursesGiven;
    }
}
