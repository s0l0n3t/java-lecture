public class GenericNullable <T>{
    private final T value;

    public GenericNullable(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
    private boolean isNull(){
        return this.getValue() == null;
    }

    public void run(){
        if(isNull()){
            System.out.println("Değişken null");
        }
        else{
            System.out.println(this.getValue());
        }
    }
}
