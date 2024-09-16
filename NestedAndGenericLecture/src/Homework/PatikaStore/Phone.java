package Homework.PatikaStore;

public class Phone implements Comparable<Phone>{
    private int id;
    private String name;
    private int price;
    private int storage;
    private double screen;
    private String companyName;
    private int camera;
    private double battery;
    private int ram;

    public Phone(int id,String name,String companyName,int price,double screen,int storage,int camera,double battery,int ram){
        this.id = id;
        this.name= name;
        this.price = price;
        this.screen = screen;
        this.storage = storage;
        this.battery = battery;
        this.camera = camera;
        this.ram = ram;
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

    public double getScreen() {
        return screen;
    }

    public int getPrice() {
        return price;
    }

    public int getStorage() {
        return storage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getBattery() {
        return battery;
    }

    public int getCamera() {
        return camera;
    }

    public int getRam() {
        return ram;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public int compareTo(Phone o) {
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
                "| "+ camera +"\t"+
                "| "+ battery +"\t"+
                "| "+ ram + " | ";

    }

}
