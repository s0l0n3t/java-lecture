import java.util.Iterator;
import java.util.Vector;

public class VectorClassLecture {
    public static void main(String[] args) {
        Vector<String> vectorVar = new Vector<>();

        vectorVar.add("Kocaeli");
        vectorVar.add("İstanbul");
        vectorVar.add("İzmir");

        System.out.println(vectorVar.contains("Kocaeli"));

        Iterator<String> itrVar = vectorVar.iterator();
        while (itrVar.hasNext()){
            System.out.println(itrVar);
        }
    }
}
