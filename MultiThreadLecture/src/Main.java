import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//
//        ThreadLectureClass thread1 = new ThreadLectureClass("Vector1");
//        ThreadLectureClass thread2 = new ThreadLectureClass("Trio");
//
//        thread1.start();
//        thread2.start();
//
//        RunnableLectureClass threadRunnable1 = new RunnableLectureClass("Test-1",10);
//        RunnableLectureClass threadRunnable2 = new RunnableLectureClass("Test-2",20);
//        RunnableLectureClass threadRunnable3 = new RunnableLectureClass("Test-3",30);
//
//        Thread thread1 = new Thread(threadRunnable1);
//        Thread thread2 = new Thread(threadRunnable2);
//        Thread thread3 = new Thread(threadRunnable3);
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        Thread.sleep(5000);
//        threadRunnable1.stop();
//        threadRunnable2.stop();
//        threadRunnable3.stop();

        //Thread stopping.



        ArrayList<Thread> threadList = new ArrayList<>();
        CriticalSectionLecture threadCritical1 = new CriticalSectionLecture();
        for(int i = 0;i<100;i++){
            Thread t1 = new Thread(threadCritical1);
            threadList.add(t1);
            t1.start();
        }
        for(Thread t: threadList){
            t.join();
        }
        System.out.println(threadCritical1.getId());

        //Threadpool using :
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        for(int i = 0;i<100;i++){
            threadPool.execute(threadCritical1);
        }
    }
}