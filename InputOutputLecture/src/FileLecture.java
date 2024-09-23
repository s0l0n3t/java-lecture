import java.io.*;
public class FileLecture {
    public static void main(String[] args) throws IOException {
        try {
            File dosya = new File("PatikaDevLecture.txt");
            if(dosya.createNewFile()){
                System.out.println(dosya.getName() + " file created");

            }
            else {
                System.out.println("File already has been located.");
                dosya.delete();

            }
        }

        catch (Exception exception){
            System.out.println(exception.toString());
        }

        File dizin = new File("LectureTest");
        dizin.mkdir();
        dizin.createNewFile();
        String[] dizinList = dizin.list();

        for (int i = 0;i<dizinList.length;i++){
            System.out.println(dizinList[i]);
        }
    }

}

