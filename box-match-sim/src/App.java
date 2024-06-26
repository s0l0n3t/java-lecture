public class App {
    public static void main(String[] args) throws Exception {
        Fighter Mike = new Fighter("Mike", 102, 20, 150);
        Fighter John = new Fighter("John", 101, 18, 142);

        Match match1 = new Match(Mike,John);
        match1.run();
        
    }
}
