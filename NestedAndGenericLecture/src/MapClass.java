import java.util.HashMap;
import java.util.*;

public class MapClass {
    public static void main(String[] args) {
        Map<String,String> lectureMap = new HashMap<>();

        lectureMap.put("TR","Türkiye");
        lectureMap.put("EN","İngiltere");
        lectureMap.put("GR","Almanya");

        lectureMap.remove("GR");
        System.out.println(lectureMap.get("TR"));
        System.out.println(lectureMap.get("GR"));

        for (String lectureMapKey : lectureMap.keySet()){
            System.out.println(lectureMapKey);
        }
        LinkedHashMap<String,Integer> lectureHashMapLinked = new LinkedHashMap<>();
        lectureHashMapLinked.put("Furkan",101);
        lectureHashMapLinked.put("Ahmet",102);
    }
}
