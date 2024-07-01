import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    int sum=0;
    int count=0;
    int[] arrayNumber =new int[n];
    for(int i=0;i<n;i++)
    {
        arrayNumber[i]=input.nextInt();

    }

    for(int i=0;i<n;i++)
    {   
        for(int j=0;i+j<arrayNumber.length;j++)
        {
            sum=0;

            for(int k=i;k<=i+j;k++)
            sum+=arrayNumber[k];
            if(sum<0)
            count++;
        }
    }
    System.out.println(count);


        



    }


}
