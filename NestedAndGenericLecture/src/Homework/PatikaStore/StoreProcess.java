package Homework.PatikaStore;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreProcess {
    private ArrayList<Notebook> productNotebook = new ArrayList<>();
    private ArrayList<Phone> productPhone = new ArrayList<>();
    private String intro = " Patika store yönetim paneli";
    private String buymenu1 = """
                1 - Notebook İşlemleri
                2 - Cep Telefonu İşlemleri
                3 - Marka Listele
                0 - Çıkış Yap
                """;
    private String buyNotebook = """
            ----------------------------------------------------------------------------------------------------
            | ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |
            ----------------------------------------------------------------------------------------------------
            """;
    private String buyPhone = """
            
            --------------------------------------------------------------------------------------------------------------------------------------
            | ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | Kamera    | Pil       | RAM       | Renk      |\s
            --------------------------------------------------------------------------------------------------------------------------------------
            """;
    public StoreProcess(){
        CompanyClass companyClass = new CompanyClass();
        System.out.println(this.getIntro());
        System.out.println(this.getBuymenu1());
        Scanner stdScanner = new Scanner(System.in);
        switch (stdScanner.nextInt()){
            case 1:
                buyMenu1Process();
                break;
            case 2:
                buyMenu2Process();
                break;
            case 3:
                CompanyClass.getBandListString();
                break;
            case 0:
                break;
        }
    }
    private void buyMenu1Process(){
        System.out.println(this.getBuyNotebook());
        productNotebook.add(new Notebook(1,"Matebook 14","HUAWEI",7000,14.0,512,16));
        productNotebook.add(new Notebook(2,"V14 IGL","LENOVO",3699,14.0,1024,8));
        productNotebook.add(new Notebook(3,"Tuf Gaming","ASUS",8199,15.6,2048,32));
        for(int i = 0;i<this.productNotebook.size();i++){
            System.out.println(getProductNotebook().get(i).toString());
        }
    }
    private void buyMenu2Process(){
        System.out.println(this.getBuyPhone());
        productPhone.add(new Phone(1,"SAMSUNG GALAXY A51","SAMSUNG",3199,6.5,128,32,4000,6));
        productPhone.add(new Phone(2,"iPhone 11 64 GB","APPLE",7379,6.1,128,5,3046,6));
        productPhone.add(new Phone(3,"Redmi Note 10 Pro 8GB","XIAOMI",4012,6.5,128,35,4000,12));
        for(int i = 0;i<this.productPhone.size();i++){
            System.out.println(getProductPhone().get(i).toString());
        }
    }

    public String getIntro() {
        return intro;
    }

    public String getBuymenu1() {
        return buymenu1;
    }

    public String getBuyNotebook() {
        return buyNotebook;
    }

    public String getBuyPhone() {
        return buyPhone;
    }

    public ArrayList<Notebook> getProductNotebook() {
        return productNotebook;
    }

    public ArrayList<Phone> getProductPhone() {
        return productPhone;
    }
}
