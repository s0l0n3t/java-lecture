public interface IDatabase <T>{
    public boolean add(T data);
    public boolean delete(T data);
    public boolean update();
    public T select();
    public void setIsNull();

}
