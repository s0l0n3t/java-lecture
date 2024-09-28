import java.util.Scanner;

public class MatrixProcessClass {
    private int[][] firstMatrix;
    private int[][] secondMatrix;
    private final String startEntering = """
                -------------------------------------
                |   Matrix multiple homework        |
                |-----------------------------------|
                """;

    public MatrixProcessClass(){
        startProcess();
        if(this.firstMatrix.length >= this.secondMatrix[0].length && this.firstMatrix[0].length >= this.secondMatrix.length){
            matrixMultiple(this.firstMatrix,this.secondMatrix);
        }
        else {
            throw new RuntimeException("matrix can't multiple.");
        }
        //multiple process
    }
    public void createMatrix(int[][] array){
        for(int k = 0;k<array.length;k++){
            for (int j = 0;j< array[k].length;j++){
                array[k][j] = (int)(Math.random()*10);
                System.out.print(array[k][j]+ " ");
            }
            System.out.println();
        }
    }
    private void startProcess(){
        Scanner varScanner = new Scanner(System.in);
        System.out.println(getStartEntering());
        System.out.println("First matrix");
        System.out.print("> ");
        this.firstMatrix = new int[varScanner.nextInt()][varScanner.nextInt()];
        createMatrix(this.firstMatrix);
        System.out.println("Other matrix");
        System.out.print("> ");
        this.secondMatrix = new int[varScanner.nextInt()][varScanner.nextInt()];
        createMatrix(this.secondMatrix);
        System.out.println();
    }
    public void matrixMultiple(int[][] array1,int[][] array2){
        int[][] arrayResult =new int[array1.length][array2[0].length];
        for(int i = 0;i<arrayResult.length;i++){//3
            for(int k = 0;k<arrayResult[i].length;k++){//2
                arrayResult[i][k] = multiplyMatrix(array1,array2,i,k);
                System.out.print(arrayResult[i][k] + " ");
            }
            System.out.println();
        }
    }
    private int multiplyMatrix(int[][] array1,int[][] array2,int row,int col){
        int cell = 0;
        for(int i = 0;i<array2.length;i++){
            cell += array1[row][i] * array2[i][col];
        }
        return cell;
    }

    public String getStartEntering() {
        return startEntering;
    }

}
