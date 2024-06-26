public class Student {
    Course A1;
    Course A2;
    Course A3;
    String name;
    String stdN;
    int classes;
    double avarage;
    boolean isPass;



    Student(String name,String stdN,int classes,Course A1,Course A2,Course A3){
        this.name = name;
        this.stdN = stdN;
        this.classes = classes;
        this.A1 = A1;
        this.A2 = A2;
        this.A3 = A3;
        this.avarage = 0.0;
        this.isPass = false;


    }

    void addNote(int e1Note,int e2Note, int e3Note){
        if(e1Note > 0 && e1Note < 100){
            this.A1.note = e1Note;
        
        
        }
        if(e2Note > 0 && e2Note < 100){
            this.A2.note = e2Note;
        }
        if(e3Note > 0 && e3Note < 100){
            this.A3.note = e3Note;
        }
        else{
            System.out.println("Notlar 0-100 aralığındadır.");
        }
    }

    void printNote(){
        System.out.println(this.A1.name + " Not: "+ this.A1.note);
        System.out.println(this.A2.name + " Not: "+ this.A2.note);
        System.out.println(this.A3.name + " Not: "+ this.A3.note);

    }

    void isPass(){
        if(A1.note >= 50 || A2.note >= 50 ||A3.note >= 50 ){
            this.isPass = true;
        }
    }
}
