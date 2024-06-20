import java.util.Scanner;;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner loScanner = new Scanner(System.in);

        int query=0,a=0,b=0,n=0,total=0;
        query = loScanner.nextInt();
        if (query >= 0 && query <= 500){
        
        for(int i = 0;i< query;i++){
            
            a = loScanner.nextInt();
            b = loScanner.nextInt();
            n = loScanner.nextInt();
            total = a;
            if(a <= 50 && a >= 0 && b <= 50 && b>= 0 ){
                
                
                
                for(int x = 0; x<= n-1; x++){
                    total += Math.pow(2, x) * b;
                    System.out.print(total + " ");
                }
                
        }
            else{
                
            }
            System.out.println();
            total = a;
        }
    }
    else{
        //else
        
    }
     loScanner.close();   
    }
}
