public class RunnableLectureClass implements Runnable{
    private String name;
    private int count;
    private boolean status = true;

    public RunnableLectureClass(String name,int count){
        this.name = name;
        this.count = count;
    }
    @Override
    public void run(){
        System.out.println(this.getName() + " sayacı başladı !");
        int i =1;
        while (status){

            if(i % this.count == 0){
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                }
            System.out.println(this.getName() + " "+i++);



        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void stop(){
        this.status = false;
    }
}
