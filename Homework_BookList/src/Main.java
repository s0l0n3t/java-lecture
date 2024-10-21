import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book>bookArrayList = new ArrayList<>();
        bookArrayList.add(new Book("Kızıl Diş",124,"Furkan TOKGÖZ",12052005));
        bookArrayList.add(new Book("Beyaz Diş",250,"Furkan TOKGÖZ",20052012));
        bookArrayList.add(new Book("Son Mahluk",80,"Furkan TOKGÖZ",13122004));
        bookArrayList.add(new Book("Geçici Günler",150,"Furkan TOKGÖZ",12052005));
        bookArrayList.add(new Book("Türk Kartallarının Doğuşu",180,"Furkan TOKGÖZ",12052005));
        bookArrayList.add(new Book("Sızma Sanatı",90,"Furkan TOKGÖZ",12052005));
        bookArrayList.add(new Book("TESLA",255,"Furkan TOKGÖZ",12052005));
        bookArrayList.add(new Book("Sineklerin Tanrısı",177,"Furkan TOKGÖZ",12052005));
        bookArrayList.add(new Book("Asla Yalnız Yeme",115,"Furkan TOKGÖZ",12052005));
        bookArrayList.add(new Book("Operasyon",145,"Furkan TOKGÖZ",12052005));
        bookArrayList.add(new Book("Aya Yolculuk",40,"Furkan TOKGÖZ",12052005));
        HashMap<String,Integer> bookHashMap = new HashMap<>();
        bookArrayList.stream().forEach(i -> bookHashMap.put(i.getName(),i.getPage()));
        System.out.println(bookHashMap.toString());
        //Normalde String,String yapısında bir hashmap initialize e
        bookArrayList.stream().filter(i -> i.getPage() < 100).forEach(i -> System.out.println(i.getName()));

    }
}