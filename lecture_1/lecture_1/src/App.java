 class oopLectureTest {
    int x = 15;
    
}

public class App {
    public static void main(String[] args) {
        
        oopLectureTest oopObjLectureTest = new oopLectureTest();
        oopLectureTest oopObject1LectureTest = new oopLectureTest();
        oopObjLectureTest.x = 10;

        System.out.print("Hello java, let me begin.\n");
        System.out.print(oopObjLectureTest.x);
        System.out.print("\nChanged variable in same class = ");
        System.out.print(oopObject1LectureTest.x);

        /*
         * @author Furkan TOKGÖZ, 2024
         */
    }
}
