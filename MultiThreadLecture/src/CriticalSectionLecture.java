public class CriticalSectionLecture implements Runnable{
    private volatile int id;
    private final Object LOCK = new Object();

    public CriticalSectionLecture(){
        this.id = 0;
    }

    @Override
    public void run(){
        try {
            Thread.sleep(2000);

        }catch (InterruptedException exception){
            System.out.println(exception.getMessage());
        }
//        synchronized (LOCK){
//            this.id++;
//            System.out.println(Thread.currentThread().getName()+" parçacığı : "+id);
//        }
        increasedId();
    }
    public void increasedId(){
        synchronized (LOCK){
            this.id++;
            System.out.println(Thread.currentThread().getName()+" parçacığı : "+id);
        }
    }
//    public synchronized void increasedId(){
//        this.id++;
//        System.out.println(Thread.currentThread().getName()+" parçacığı : "+id);
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
