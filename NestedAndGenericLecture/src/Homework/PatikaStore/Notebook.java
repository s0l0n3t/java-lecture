package Homework.PatikaStore;

public class Notebook implements Comparable<Notebook>{
    private int id;
    private String name;
    private String companyName;
    private double screen;
    private int storage;
    private int ram;
    private int price;
    public Notebook(int id,String name,String companyName,int price,double screen,int storage,int ram){
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.screen = screen;
        this.storage = storage;
        this.ram = ram;
        this.price = price;
        if(CompanyClass.isContain(companyName)){
            this.companyName = companyName;
        }
        else{
            throw new RuntimeException("This company name is not included !");
        }
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public int compareTo(Notebook o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "| "+ id +"\t"+
                "| "+ name + "\t" +
                "| "+ price+"\t"+
                "| "+companyName + "\t"+
                "| "+ storage +"\t"+
                "| "+ screen +"\t"+
                "| "+ ram + " | ";

    }
}
