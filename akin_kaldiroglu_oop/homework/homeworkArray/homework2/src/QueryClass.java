import java.util.Arrays;

public class QueryClass implements IStack {
    //FiFo Queue example
    public static int MAX_STACK_SIZE;
    private static String[] queryArray;
    private String varLast;
    public QueryClass(int MAX_STACK_SIZE){
        QueryClass.MAX_STACK_SIZE = MAX_STACK_SIZE;
        queryArray = new String[MAX_STACK_SIZE];
    }
    @Override
    public void push(String newElement){
        String[] testArray = new String[MAX_STACK_SIZE];
        for(int i = 0;i< MAX_STACK_SIZE;i++){
            if(i+1 < MAX_STACK_SIZE){
                    testArray[i+1] = queryArray[i];
                }
            }
        queryArray = Arrays.copyOf(testArray,MAX_STACK_SIZE);
        queryArray[0] = newElement;
    }

    @Override
    public String pop() {
        varLast = queryArray[this.size()-1];
        queryArray[this.size()-1] = null;
        return varLast;
    }

    @Override
    public void clear() {
        for(int i = 0;i<queryArray.length;i++){
            queryArray[i] = null;
        }
    }

    @Override
    public boolean isEmpty() {
        if(this.size() == 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if(this.size() == MAX_STACK_SIZE){
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        for(int i = 0;i< queryArray.length;i++){
            if(queryArray[i] == null){
                return i;
            }
        }
        return MAX_STACK_SIZE;
    }

    @Override
    public int getCapacity() {
        return MAX_STACK_SIZE;
    }

    @Override
    public void showElements() {
        System.out.print("\n{");
        for(int i = 0;i<MAX_STACK_SIZE;i++){
            if(i+1 != MAX_STACK_SIZE){
                System.out.print(queryArray[i]+",");
            }
            else {
                System.out.print(queryArray[i]);
            }
        }
        System.out.print("}\n");
    }

    public String getVarLast() {
        return varLast;
    }
}
