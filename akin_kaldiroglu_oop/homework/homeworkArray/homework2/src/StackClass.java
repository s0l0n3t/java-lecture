import java.lang.reflect.Array;
import java.util.Arrays;

public class StackClass implements IStack{
    public static int MAX_STACK_SIZE;
    private boolean isFull = false;
    private static String[] stackString;
    private int pointer = 0;
    private String varLast;
    public StackClass(int MAX_STACK_SIZE){
        StackClass.MAX_STACK_SIZE = MAX_STACK_SIZE;
        stackString = new String[MAX_STACK_SIZE];
    }
    @Override
    public void push(String newElement) {
        if(!isFull){
            if(pointer< MAX_STACK_SIZE){
                stackString[pointer] = newElement;
                pointer++;
            }
            if(pointer == MAX_STACK_SIZE){
                this.isFull = true;
            }
        }
        else{
            throw new RuntimeException("Max length");
        }
    }

    @Override
    public String pop() {
        if(pointer-1 > 0){
            varLast =  stackString[pointer-1];
            stackString[pointer-1] = null;
            pointer--;
            if(pointer != MAX_STACK_SIZE){
                this.isFull = false;
            }
        }
        return varLast;
    }

    @Override
    public void clear() {
        for(int i = 0;i<stackString.length;i++){
            stackString[i] = null;
        }
        pointer = 0;
        isFull = false;
    }

    @Override
    public boolean isEmpty() {
        return pointer <= 0;
    }

    @Override
    public boolean isFull() {
        return this.isFull;
    }

    @Override
    public int size() {
        return pointer;
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
                System.out.print(stackString[i]+",");

            }
            else {
                System.out.print(stackString[i]);
            }
        }
        System.out.print("}\n");
    }
    public String getLast() {
        return varLast;
    }
}
