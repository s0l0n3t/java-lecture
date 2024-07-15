import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner regScanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int varCount = regScanner.nextInt();
        String cache = "";
        String varStringChanger = "";
        regScanner.nextLine();
        


        for(int a = 0;a<varCount;a++){
            String added = regScanner.nextLine();
            added += " ";
            for(int i = 0; i< added.length();i++){//String to list
            
                if(added.charAt(i) != ' '){
                    cache+= added.charAt(i);
                    
                }
                else{
                    list.add(cache);
                    cache = "";
                }
            }
            
            //Find in list
            for(int j = 0;j<list.size();j++){
                for(int k = 0;k<list.size();k++){
                    if(list.get(j).toLowerCase().equals(list.get(k).toLowerCase()) && j != k){
                        list.remove(list.get(k));
                    }
                }
    
            }
            for(int s = 0;s<list.size();s++){
                varStringChanger += list.get(s) + " ";
               
            }
            System.out.println(varStringChanger.substring(0,varStringChanger.length()-1));
            varStringChanger = "";
            list.removeAll(list);
        }


        
        


        
        





                
            }
        }
        
    

