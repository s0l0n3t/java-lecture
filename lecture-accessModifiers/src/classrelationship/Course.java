package classrelationship;

public class Course {
    private String courseName;
    private String courseCode;


    public Course(String courseName,String courseCode){
        this.courseCode = courseCode;
        this.courseName = courseName;

    }



    public String getCourseName() {
        return courseName;
    }
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    //This means course class uses a student class.
    public double calculateAvarage(Student[] students){
        double sum = .0;
        for (int x = 0; x< students.length; x++){
            sum += students[x].getCourseNote();
        }
        return sum / students.length;
    }

}
