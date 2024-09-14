import java.util.*;

class Student{
    private int id;
    private String name;
    private double cgpa;

    public Student(int id,String name,double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public double getCGPA(){
        return this.cgpa;
    }

}
class Priorities{
    public Student students;
    public List<Student> getStudents(List<String> stringList){
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.getCGPA() != s2.getCGPA() ? s2.getCGPA() - s1.getCGPA() > 0 ? 1 : -1 : !s1.getName().equals(s2.getName()) ? s1.getName().compareTo(s2.getName()) :  s1.getID() > s2.getID() ? 1 : -1;
            }
        });
        List<Student> lstStudent = new ArrayList<>();
        for (int i = 0;i<stringList.size();i++){
            String[] arrlist =  stringList.get(i).split(" ",4);
            if(arrlist[0].equals("ENTER")){
                priorityQueue.add(new Student(Integer.parseInt(arrlist[3]),arrlist[1],Double.parseDouble(arrlist[2])));

            }
            else {
                priorityQueue.poll();
            }
        }
        while (!priorityQueue.isEmpty()) {
            lstStudent.add(priorityQueue.poll());
        }
        return lstStudent;
    }
}




public class Main {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}