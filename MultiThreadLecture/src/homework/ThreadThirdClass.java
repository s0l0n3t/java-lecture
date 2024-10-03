package homework;

public class ThreadThirdClass extends ThreadSecondClass{
    private final Object LOCK = new Object();
    @Override
    public void run(){
        synchronized (LOCK){
            for (Integer i : ThreadMainClass.thread3) {
                increment(i);
            }
        }
    }
}
