
public class WrapperClass {

    public static void main(String[] args) {
        int a = 20;
        Integer b = 20;
        String str = "abc".toString(); //we called wrapper class toString
        Short s = 2;

        String as = "10";
        int bs = 20;
        int c = Integer.parseInt(as);

        System.out.println(c+10 + " "+ as+10);
        //20 1010

    }

}
