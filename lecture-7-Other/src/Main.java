public class Main {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        System.out.println(b);

        double c = 25.3;
        System.out.println((int) c);

        int varTest = 11;
        String varString = String.valueOf(varTest);
        System.out.println(varString);

        int j = Integer.parseInt(varString);
        System.out.println(j+a);


        //lambda expression

        new Runnable(){
            @Override
            public void run(){
                System.out.println("Runnable Class");
            }
        }.run();

        Runnable r2 = () -> {
            System.out.println("Lambda runnable class");
        };
        r2.run();

        Matematik toplama = new Matematik() {
            @Override
            public int transaction(int a, int b) {
                return a+b;
            }
        };
        System.out.println(toplama.transaction(5,6));


        //Lambda expression

        Matematik toplamaLambda = (e,f) -> e+f;
        Matematik carpmaLambda = (e,f) -> e*f;
        Matematik cikartmaLambda = (e,f) -> e-f;
        Matematik bolmeLambda = (e,f) -> {
            if(f == 0){
                return 0;
            }
            if(e == 0){
                return 0;
            }
            return e/f;

        };
        System.out.println(toplamaLambda.transaction(7,8));
        System.out.println(bolmeLambda.transaction(6,0));
        System.out.println(bolmeLambda.transaction(6,2));

    }
}