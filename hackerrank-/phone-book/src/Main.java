//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;


//Solution is good but output gets on so much time.
class Main{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String[] personList = new String[n];
        String[] personListConfirmed = new String[n];
        int[] personPhone = new int[n];
        if(n >= 1 && n<= 100000){
            for(int i=0;i<n;i++)
            {
                String name=in.nextLine();
                personList[i] = name;
                int phone=in.nextInt();
                personPhone[i] = phone;
                in.nextLine();
            }
            while(in.hasNext())
            {
                String s=in.nextLine();
                //System.out.println(s);
                for(int i = 0;i<personList.length;i++){
                    if(personList[i].equals(s)){

                        personList[i] = "";
                        personListConfirmed[i] = s;
                    }

                }
            }
            for(int i = 0;i<personList.length;i++){
                if(!personList[i].isEmpty()){
                    System.out.println("Not found");
                }else{

                    System.out.println(personListConfirmed[i] + "="+ personPhone[i]);
                }

            }

        }

    }
}



