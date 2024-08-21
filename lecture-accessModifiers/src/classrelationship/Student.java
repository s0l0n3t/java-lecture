package classrelationship;

public class Student {
    private String firstName;
    private String lastName;
    private int id;
    private int courseNote;
    private Course course;

    public Student(String firstName,String lastName, int id,int courseNote,Course course){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        if(courseNote <= 100 && courseNote >= 0 ){
            this.courseNote = courseNote;
        }
        else{
            this.courseNote = 0;
        }
        this.course = course;
    }


    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public int getCourseNote() {
        return courseNote;
    }

    public void setCourseNote(int courseNote) {
        this.courseNote = courseNote;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
