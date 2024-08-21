public class EncapculationLecture {
    private String name;
    private String companyName;
    private int id;
    private static int counter = 0;

    public EncapculationLecture(){
        System.out.println("Object created.");
        counter++;
    }
    public String getCompanyName() {
        return companyName;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public static int getCounter() {
        return counter;
    }
}
