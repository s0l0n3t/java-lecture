package homework;
import java.util.*;

public class ThreadMainClass {
    public static List<Integer> thread1 = new ArrayList<>();
    public static List<Integer> thread2 = new ArrayList<>();
    public static List<Integer> thread3 = new ArrayList<>();
    public static List<Integer> thread4 = new ArrayList<>();
    public static List<Integer> evenNumbers = new ArrayList<>();
    public static List<Integer> oddNumbers = new ArrayList<>();
    List<Integer> numbers = new ArrayList<>();

    public ThreadMainClass(){
            for(int i = 1;i<= 10000;i++){
                numbers.add(i);
            }
            for(int i = 0;i<numbers.size();i++){
                if(i< numbers.size()*1/4){
                        thread1.add(i);
                }
                else if(i< numbers.size()*1/2){
                    thread2.add(i);
                } else if (i< numbers.size()*3/4) {
                    thread3.add(i);
                }
                else{
                    thread4.add(i);
                }
            }
        }
    }


