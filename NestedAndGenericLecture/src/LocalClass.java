public class LocalClass {

    public void run(){
        class local{
            private int id;
            public local(int id){
                 this.id = id;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }
    }
}
