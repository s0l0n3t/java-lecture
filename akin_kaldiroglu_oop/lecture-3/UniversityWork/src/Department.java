import java.util.Arrays;

public class Department {
    private String name;
    public Professor head;
    public Course[] courses;
    Student[] students;

    public Department(String name){
        this.name = name;
        this.courses = new Course[2];
        this.students = new Student[2];
    }

    public Student[] getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public Course[] getCourses() {
        return courses;
    }

    public Professor getHead() {
        return head;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public void setHead(Professor head) {
        this.head = head;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    public void addCourse(Course course){
        Course[] increasedCourses = new Course[this.courses.length+1];
        for(int i = 0;i<this.courses.length;i++){
            increasedCourses[i]= courses[i];
        }
        courses = increasedCourses;
        for(int i =0;i<this.courses.length;i++){
            if(courses[i] == null){
                courses[i] = course;
                break;
            }
        }
    }

    public void addStudent(Student student){
        for(int i =0;i<this.students.length;i++){
            if(students[i] == null){
                students[i] = student;
                break;
            }
        }
    }
}
