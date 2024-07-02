import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Mayın tarlasına Hoşgeldiniz");
        /*
        Scanner matScanner = new Scanner(System.in);
        int matrisHigh = matScanner.nextInt();
        int matrisWidth = matScanner.nextInt();
        if(matrisHigh >= 2 && matrisWidth >= 2){
            mine.createMinefield(matrisHigh, matrisWidth);

        } */



        int[] arr = {1,2,3,-1,2,3,4,5,1,2,3};
        int countPositive = 0;
		int sumTwo = 0;
		for(int i = 0; i<arr.length;i++){
			if(i > 0){
				countPositive++;
			}
		}

		if(countPositive > 0){
			for(int k = 0; k< arr.length;k++){
				for(int j = 0;j< arr.length;j++){
					if((arr[k] + arr[j]) > sumTwo && k != j){
						sumTwo = arr[k] + arr[j];
                        System.out.print("Toplama :"+ arr[k] + " " + arr[j]);
                        
                        System.out.println();
					}
				}
			}
            System.out.println("\nÇÖZÜM :");
			System.out.println(sumTwo);
		}
		else{
			System.out.println("0");
		}
	}

    }



   

