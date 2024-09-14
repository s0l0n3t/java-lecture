import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListClass {
    public static void main(String[] args) {
        List<Integer> varIntList = new ArrayList<>();
        varIntList.add(3);
        varIntList.add(5);
        varIntList.add(null);
        Iterator<Integer> itr = varIntList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        for (Integer number: varIntList){
            System.out.println(number);
        }
        varIntList.size();//list size

        System.out.println(varIntList.get(1));
        System.out.println(varIntList.getFirst());//first index of array.
        System.out.println(varIntList.lastIndexOf(5));
        varIntList.remove(1);//delete from index.
        varIntList.removeFirst();//delete first index.

    }
}

