

import java.util.*;

    public class ArrayListSolution {

        public static void main(String[] args) {
            //solution with arraylist.
            Scanner vScanner = new Scanner(System.in);
            int row = vScanner.nextInt();
            List<List<Integer>> arrayInteger = new ArrayList<List<Integer>>();
            //int[][] arrayInteger = new int[row][row];
            for(int x = 0;x<row;x++){
                int column = vScanner.nextInt();
                ArrayList<Integer> arr = new ArrayList<>();
                for(int a = 0;a< column;a++){
                    arr.add(vScanner.nextInt());
                    /*System.out.println("array created "+ row+" first int "+ column+ " array "+x+" value"+ value); */
                }
                arrayInteger.add(arr);

            }
            int valuePrinter = vScanner.nextInt();
            for(int vPrint = 0;vPrint<valuePrinter;vPrint++){
                try {
                    System.out.println(arrayInteger.get(vScanner.nextInt()-1).get(vScanner.nextInt()-1));
                } catch (Exception e) {
                    System.out.println("ERROR!");
                }
            }
    }
}
