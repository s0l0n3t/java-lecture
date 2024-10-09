public class Main {
    public static void main(String[] args) {
        Professor aliObject = new Professor("101","Ali","Prof");
        Professor VeliObject = new Professor("102","Veli","Assoc");
        Professor williamObject = new Professor("202","William","Doc");
        Department eeemObject = new Department("Electronic-Engineering");
        eeemObject.addCourse(new Course("eem101","Eem Introduction"));
        eeemObject.addCourse(new Course("eem201","Electronics 1"));
        eeemObject.addCourse(new Course("eem202","Electronics 2"));
        eeemObject.addStudent(new Student("12312312312","Halil Mutlu"));
        eeemObject.getCourses()[0].setProfessor(williamObject);
        System.out.println(eeemObject.getCourses()[0].getProfessor().getName());
        System.out.println(eeemObject.getStudents()[0].getName());




    }
}