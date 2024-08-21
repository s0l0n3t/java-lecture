package classrelationship;

public class main {
    public static void main(String[] args) {
        Course mat = new Course("Math","MAT101");
        //Student has a course. Aggretation / Composition
        Student ahmet = new Student("Ahmet","Candan",833,50,mat);
        Student yılmaz = new Student("Yılmaz","Ocaklar",567,70,mat);
        Student kenan = new Student("Kenan","Semerci",234,80,mat);

        Student[] students = {ahmet,yılmaz,kenan};
        System.out.println("Math note avarage in class : "+ mat.calculateAvarage(students));

        System.out.println(ahmet.getCourse().getCourseName());
    }
}
