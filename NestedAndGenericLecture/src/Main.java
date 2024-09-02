public class Main {
    public static void main(String[] args) {
        InnerClass innerObject = new InnerClass();
        innerObject.add();
        System.out.println("New object:");
        System.out.println(innerObject.createClass().a);
        innerObject.createClass().a += 1;

        System.out.println(innerObject.createClass().a);

        Anonym anonymClass = new Anonym(){
          @Override
          public void run(){
              System.out.println("run method override.");
          }
        };
        anonymClass.run();
    }
}