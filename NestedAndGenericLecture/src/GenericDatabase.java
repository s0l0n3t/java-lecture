public class GenericDatabase<T> implements IDatabase<T>{


    @Override
    public boolean add(T data) {
        System.out.println("Data added.");
        return false;
    }

    @Override
    public boolean delete(T data) {
        System.out.println("Data deleted.");
        return false;
    }

    @Override
    public boolean update() {
        System.out.println("Data updated.");
        return false;
    }

    @Override
    public T select() {
        System.out.println("Data selected.");
        return null;
    }

    @Override
    public void setIsNull() {

    }

}
