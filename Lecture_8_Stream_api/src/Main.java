import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(25);
        arrayList.add(15);
        arrayList.add(12);
        arrayList.add(5);

        arrayList.stream().forEach( i -> System.out.println(i));
        arrayList.stream().filter(num -> num>60).forEach(i -> System.out.println(i));

    }
}