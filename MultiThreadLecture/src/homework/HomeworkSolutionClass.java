package homework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HomeworkSolutionClass{
    public static void main(String[] args) throws InterruptedException {
        new ThreadMainClass();
        ThreadFirstClass threadFirstClass = new ThreadFirstClass();
        ThreadSecondClass threadSecondClass = new ThreadSecondClass();
        ThreadThirdClass threadThirdClass = new ThreadThirdClass();
        ThreadFourthClass threadFourthClass = new ThreadFourthClass();
        System.out.println("First look for even array : "+ ThreadMainClass.evenNumbers);
        System.out.println("First look for odd array : "+ ThreadMainClass.oddNumbers);

        ExecutorService threadExecute = Executors.newFixedThreadPool(16);
        for(int i = 0;i<16;i++){
            threadExecute.execute(threadFirstClass);
            threadExecute.execute(threadSecondClass);
            threadExecute.execute(threadThirdClass);
            threadExecute.execute(threadFourthClass);
        }
        threadExecute.close();


        System.out.println("First status for event array : "+ ThreadMainClass.evenNumbers);
        System.out.println("----------------------------------------------------------");
        System.out.println("Last status for event array : "+ ThreadMainClass.oddNumbers);
        System.out.println("----------------------------------------------------------");
    }
}
