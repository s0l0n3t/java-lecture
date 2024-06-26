public class App {
    public static void main(String[] args) throws Exception {
        Teacher M1 = new Teacher("Ahmet", "5393224232", "MAT");
        Teacher T1 = new Teacher("Aslı", "532", "TRH");
        Teacher F1 = new Teacher("Kemal", "531", "FZK");
        Course Matematik = new Course("Matematik", "204", "MAT",0);
        Course Tarih = new Course("Tarih", "301", "TRH", 0);
        Course Fizik = new Course("Fizik", "210", "FZK", 0);
        Matematik.addTeacher(M1);
        Tarih.addTeacher(T1);
        Fizik.addTeacher(F1);

        Student K1 = new Student("Furkan", "155", 1, Tarih, Matematik, Fizik);
        K1.addNote(100, 50, 60);
        K1.printNote();
        K1.isPass();
        if(K1.isPass == true){
            K1.classes += 1;
            System.out.println("Öğrenci "+K1.name+ " "+K1.classes+". Sınıfa geçmeye hak kazandı !");
        }
        else{
            System.out.println("Öğrenci"+K1.name+ " Kaldı :(");
        }
    }
}
