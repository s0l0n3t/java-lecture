
import java.util.Arrays;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        // java api bilgilerini dökümantasyondan elde edilebilir.
        //oracle'dan java sürümlere ait olan dökümantasyonları kaydet ve incele **
        LectureTestClass testObject = new LectureTestClass();
        HomeworkSolutions hmwrkSolObject = new HomeworkSolutions();
        new SieveOfEratosthenes(10);
        try {
            StackClass stackArray = new StackClass(5);
            stackArray.push("1");
            stackArray.push("2");
            stackArray.push("3");
            stackArray.push("4");
            stackArray.showElements();

            QueryClass queryArray = new QueryClass(5);
            queryArray.push("1");
            queryArray.push("2");
            queryArray.push("3");
            queryArray.push("4");
            queryArray.push("5");

            queryArray.showElements();
            System.out.println(queryArray.isEmpty());
            System.out.println(queryArray.size());
            System.out.println(queryArray.pop());
            System.out.println(queryArray.isFull());
            queryArray.showElements();


        }catch (Exception exception){
            System.out.println(exception.toString());
        }
    }
}



class LectureTestClass{
    private int[] lectureTest;

    public LectureTestClass(){
        lectureTest = new int[5];
        for (int i = 0;i<lectureTest.length;i++){
            lectureTest[i] = i;
        }
        System.out.println(arrayCopy(lectureTest)[0]);
        System.out.println(copyRange(lectureTest)[0]);
    }
    public int[] arrayCopy(int[] arrayCopy){
        int[] copiedArray = new int[arrayCopy.length];
        return copiedArray = Arrays.copyOf(arrayCopy, arrayCopy.length);
    }
    public int[] copyRange(int[] arrayCopy){
        int[] copiedArray = new int[3];
        return copiedArray = Arrays.copyOfRange(arrayCopy, 1, 4);
    }

}