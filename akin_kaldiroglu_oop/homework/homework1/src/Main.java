public class Main {
    public static void main(String[] args) {
        multipleStar(30);
        System.out.println();
        pyramidStar(20);
        System.out.println();
        square(5,10);
        System.out.println();
        rectangle(15,20);
        System.out.println();
        pyramideNoSpace(25);

    }
    public static void multipleStar(int max){
        for(int i = 1;i<=max;i+=2){
            System.out.println(" ");
            for (int j = 0;j<i;j++){
                System.out.print("*");
            }
        }
        System.out.println();
    }

    public static void pyramidStar(int max){
        for(int i = 1;i<max;i+=2){

            for (int x = max - i;x>1;x--){
                System.out.print(" ");
            }
            for (int j = 0; j<i;j++)
                System.out.print("* ");

            System.out.println();
        }

    }
    public static void square(int row,int column){
       for(int i = 0;i< row;i++){
            for (int j = 0 ;j<column;j++)
                System.out.print("*");
           System.out.println();
       }
    }
    public static void rectangle(int row,int column){
        for(int i = 0;i<row;i++){
            if(i == 0 || i == row-1){
                for (int j = 0;j<column;j++){
                    System.out.print("*");
                }
            }
            else {
                System.out.print("*");
                for (int j =1;j<column-1;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pyramideNoSpace(int max){
        for(int i = 1;i<max;i+=2){
            for(int k = 0;k<(max/2)-i/2;k++){
                System.out.print(" ");
            }
            for(int x = 0;x<i;x++){
                System.out.print("*");
            }
            for(int k = 0;k<(max/2)-i/2;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}