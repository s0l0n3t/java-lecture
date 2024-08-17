public class App {
    public int id;
    private int no;
    public static void main(String[] args) throws Exception {
        StaticLecture lectureTest = new StaticLecture("Thomas"); //Created a memory.
        System.out.println(lectureTest.no);
        System.out.println(lectureTest.name);
        System.out.println(StaticLecture.isAccessable);//variable accessed without memory and object. STATIC
        StaticLecture lectureTest2 = new StaticLecture("Max");
        System.out.println(lectureTest2.no);//This variable = 2 becuase we set static.

        System.out.println(StaticLecture.getName());

        StaticCodeBlocks staticCodeBlocks = new StaticCodeBlocks("Hulkenberg");
        System.out.println(StaticCodeBlocks.counter);
        finalLecture varFinal = new finalLecture(4);
        System.out.println(varFinal.calcArea());

    }   
    public void showStr(){
        System.out.println(this.id);
   }

   public String method(){
    return "Name: ";
   }// Public, can be accessable on other classes.

}
