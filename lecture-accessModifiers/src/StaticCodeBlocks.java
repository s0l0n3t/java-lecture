



public class StaticCodeBlocks {
    public String name;
    public static int counter = 0;

    public StaticCodeBlocks(String name){
        this.name = name;
        counter++;
    }

    static {//Static code block
        // Default variables on class
        int random = (int) (Math.random()*10);
        counter = random;
    }
}
