
public class StaticLecture {
    public String name;
    public static int no = 0; //When we make static no variable.
    public int id;
    public static boolean isAccessable = true;

    public StaticLecture(String name){
        this.name = name;
        no++;
    }
    
/*
    public void add(){
        this.no++;
    } */

    public static String getName(){
        return "We can't write object variables";
    }
}
