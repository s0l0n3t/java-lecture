import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> filmList = new ArrayList<>();
        Subscribe furkanSubs = new Subscribe("Furkan","Tokgoz");
        normalUser mertUser = new normalUser("Mert", "Kocabas");
        System.out.println(furkanSubs.getUserNumber());
        System.out.println(mertUser.getUserNumber());
        filmList.add("Alacakaranlık");
        filmList.add("Eyvah eyvah 2");
        filmList.add("Ölümlü dünya 1");
        while(true){
            System.out.print("""

                    1- Add a film
                    2- Buy a film
                    """);
            int selectNumber = sc.nextInt();
            if(selectNumber == 1){
                System.out.print("> ");
                filmList.add(sc.next());
            }
            else if(selectNumber == 2){
                System.out.println("What film > ");
                furkanSubs.rentFilm(20);
                System.out.println(filmList.get(sc.nextInt()-1) + " Filmi kiralandı. Alıcı: "+ furkanSubs.getName());
                System.out.println("Yeni bakiyeniz: "+ furkanSubs.getCreditUser());
            }
            else{
                System.out.println(filmList);
            }
        }
    }
} 
