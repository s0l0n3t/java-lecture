package homework;

public class ThreadFirstClass implements Runnable{
    private final Object LOCK = new Object();

    @Override
    public void run(){
        synchronized (LOCK){
            for (Integer i : ThreadMainClass.thread1) {
                increment(i);
            }
        }
    }
    public void increment(int x){
        if(x %2 == 0){
            System.out.println(Thread.currentThread().getName() + " : " + x);
            ThreadMainClass.evenNumbers.add(x);
        }
        else{
            System.out.println(Thread.currentThread().getName() + " : " + x);
            ThreadMainClass.oddNumbers.add(x);
        }
    }
}
