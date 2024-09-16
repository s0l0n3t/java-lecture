package Homework.PatikaStore;

import java.util.*;


public class CompanyClass implements Comparable<CompanyClass>{
    private int categoryId;
    private String categoryName;
    private static List<Company> bandList = new ArrayList<>();
    private ArrayList<CompanyClass> categoryList = new ArrayList<>();
    public CompanyClass(){
        categoryList.add(new CompanyClass(1,"Phone"));
        categoryList.add(new CompanyClass(2,"Notebook"));
        bandList.add(new Company("Samsung"));
        bandList.add(new Company("Lenovo"));
        bandList.add(new Company("Apple"));
        bandList.add(new Company("Huawei"));
        bandList.add(new Company("Casper"));
        bandList.add(new Company("Asus"));
        bandList.add(new Company("HP"));
        bandList.add(new Company("Xiaomi"));
        bandList.add(new Company("Monster"));
        Collections.sort(bandList);
        Collections.sort(categoryList);

    }
    public CompanyClass(int categoryId,String categoryName){
        this.categoryName = categoryName;
    }
    public ArrayList<CompanyClass> getCategoryList() {
        return categoryList;
    }

    public static List<Company> getBandList() {
        return bandList;
    }
    public static void getBandListString(){
        for(int i = 0;i<getBandList().size();i++){
            System.out.println(getBandList().get(i).getCompanyName());
        }
    }

    public static boolean isContain(String companyName){
        for(int i = 0;i< getBandList().size();i++){
            if(getBandList().get(i).getCompanyName().equalsIgnoreCase(companyName)){
                return true;
            }
        }
        return false;
    }
    public int getCategoryId() {
        return categoryId;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void getCategoryListString(){
        for(int i = 0;i<categoryList.size();i++){
            System.out.println(categoryList.get(i).getCategoryName());
        }
    }

    @Override
    public int compareTo(CompanyClass o) {
        return this.categoryName.compareTo(o.getCategoryName());
    }
}
