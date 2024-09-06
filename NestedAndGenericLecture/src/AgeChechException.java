public class AgeChechException extends Exception{
    public AgeChechException(String message){
        super(message);
        System.out.println("Age error ! (inside)");
    }
    @Override
    public String toString(){
        return "This error includes age chech(check) error.";
    }
}
