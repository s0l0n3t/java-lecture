public class Course {
    Teacher teacher;
    String name;
    String prefix;
    String code;
    int note = 0;




    Course(String name,String code,String prefix,int note){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = note;
        
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }
        else{
            System.out.println("Ders uyuşmazlığı !\n");
        }

    }

    void printTeacher(){
        this.teacher.printInfo();
    }
}