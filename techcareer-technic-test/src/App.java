public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Techcareer.net tech test ");
        int[] arr = {-1,-2,3,4,5,6,1,2,12,3,4,5};
        System.out.println("OUTPUT:");
        System.out.println("\n"+sumArray(arr));
    }

    static int sumArray(int[] arr){
        
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
                        System.out.print("Sum :"+ arr[k] + " " + arr[j]);
                        
                        System.out.println();
					}
				}
			}
            
			return sumTwo;
		}
		else{
			return 0;
		}
    }
}
