public class ThreadLectureClass extends Thread{
    public String name;
    public ThreadLectureClass(String name){
        this.name = name;
    }
    @Override
    public void run(){
        System.out.println(this.name + " thread started !");
        System.out.println("started engine");
        for (int i = 0;i<100;i++){
            System.out.println(this.name + " "+ i);
        }
    }
}
