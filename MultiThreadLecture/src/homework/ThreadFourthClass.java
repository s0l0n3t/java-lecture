package homework;

public class ThreadFourthClass extends ThreadThirdClass{
    private final Object LOCK = new Object();
    @Override
    public void run(){
        synchronized (LOCK){
            for (Integer i : ThreadMainClass.thread4) {
                increment(i);
            }
        }
    }

}
