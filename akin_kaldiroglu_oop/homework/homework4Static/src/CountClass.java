import java.util.ArrayList;

public class CountClass {
    private String name;
    private String lastName;
    private int number;
    public static int count;
    public static ArrayList<CountClass> objectArrayList = new ArrayList<>();

    public CountClass(String name,String lastName, int number){
        count++;
        this.name = name;
        this.lastName = lastName;
        this.number = number;
        CountClass.objectArrayList.add(this);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public static int getCount() {
        return count;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void setCount(int count) {
        CountClass.count = count;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
