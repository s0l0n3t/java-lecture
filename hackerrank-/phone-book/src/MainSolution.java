import java.util.HashMap;
import java.util.Scanner;

public class MainSolution {
    public static void main(String[] args) {
        HashMap<String,Integer> personPhone = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            personPhone.put(name,phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            Integer phone = personPhone.get(s);
            if(phone==null){
                System.out.println("Not found");
            } else {
                System.out.println(s+"="+phone);
            }
        }
    }
}
