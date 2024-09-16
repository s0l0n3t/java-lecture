package Homework.PatikaStore;


public class Company implements Comparable<Company>{
    private String companyName;

    public Company(String companyName){
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    @Override
    public int compareTo(Company o) {
        return this.companyName.compareTo(o.companyName);
    }
}
