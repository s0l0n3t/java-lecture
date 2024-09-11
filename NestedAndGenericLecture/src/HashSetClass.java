import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet<Integer> newHashSet = new HashSet<>();
        newHashSet.add(12);
        newHashSet.add(12);
        newHashSet.add(11);
        newHashSet.add(5);
        newHashSet.add(null);
        for(Integer sayi: newHashSet){
            System.out.println(sayi);
        }
        System.out.println(newHashSet);

        Iterator<Integer> itr =newHashSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
