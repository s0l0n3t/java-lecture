import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("LectureTest/test");
        inputStream.skip(10);// pass first 10 character.
        while (inputStream.read() != -1){
            System.out.print((char) inputStream.read());
            System.out.print((char) inputStream.read());

        }
        inputStream.close();
        System.out.println();

    }
}
