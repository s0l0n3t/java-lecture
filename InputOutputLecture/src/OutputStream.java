import java.io.FileOutputStream;

public class OutputStream {
    public static void main(String[] args) {
        String letter = "\nOutput learning lecture\n Patika.dev";

        try {
            FileOutputStream outputStream = new FileOutputStream("lectureTest/test",true);// when we set true parameter, we write same file. if there is not we will remove and create.
            byte[] letterByteArray = letter.getBytes();
            outputStream.write(letterByteArray);
            throw new RuntimeException("Letter added !");
        }catch (Exception exception){
            System.out.println(exception.toString());
        }
    }
}
