import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListClass {
    public static void main(String[] args) {

        Queue<String> qList = new LinkedList<>();
        qList.add("Furkan");
        qList.add("123");
        qList.add("Hello Queue !");
        qList.remove();// Deletes first data.
        qList.offer("Furkan");// adds data to last index.
        System.out.println(qList.poll());// prints first data and deletes.
        System.out.println("----");
        System.out.println(qList.peek());//
        System.out.println("----");

        Iterator<String> itr = qList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
