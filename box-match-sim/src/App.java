public class App {
    public static void main(String[] args) throws Exception {
        Fighter Mike = new Fighter("Ali", 102, 20, 150);
        Fighter John = new Fighter("Furkan", 101, 20, 140);

        Match match1 = new Match(Mike,John);
        match1.run();
        
    }
}
