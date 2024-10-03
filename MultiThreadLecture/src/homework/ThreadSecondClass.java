package homework;

public class ThreadSecondClass extends ThreadFirstClass{
    private final Object LOCK = new Object();
    @Override
    public void run(){
        synchronized (LOCK){
            for (Integer i : ThreadMainClass.thread2) {
                increment(i);
            }
        }
    }
}
