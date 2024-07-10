import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        
        Scanner scanner = new Scanner(System.in);
        int steps = scanner.nextInt();
        int badElement = scanner.nextInt();
        int index1 = 0;
        for(int i = 1; i <=steps;i++){
            if(badElement == index1+i){
                
                
            }
            else{
            index1 += i;
            }
        }
       
        int index2 =0;
        for(int i = 1; i <=steps;i++){
            if(badElement == index2+i){
                
                
            }
            else if(i == 1){

            }
            else{
            index2 += i;
            }
        }
        if(index1 >= index2){
            System.out.println(index1);
        }
        else{
            System.out.println(index2);
        }
        


    }
}
