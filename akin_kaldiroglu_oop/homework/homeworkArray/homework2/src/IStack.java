public interface IStack {
    public static final int MAX_STACK_SIZE = 0;
    public void push(String newElement);
    public String pop();
    public void clear();

    //Stack status operations
    public boolean isEmpty();
    public boolean isFull();
    public int size();
    public int getCapacity();
    public void showElements();
}
