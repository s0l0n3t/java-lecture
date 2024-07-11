


public class EncapsulationLecture {
    private String name;
    private String sirname;

    
    EncapsulationLecture(){
        this.name = "Nameless";
        this.sirname = "Sirnameless";
        //Eğer bir nesne initialize edilmezse default olarak değişken değerlerini verebilmekteyiz.
        System.out.println(name + " "+ sirname+" Initialized.");
    }
    //Constructor yapısıdır.
    EncapsulationLecture(String name,String sirname){
        this.name = name;
        this.sirname = sirname;
    }
    //Constructor metoduna overloading yapıldı.
    EncapsulationLecture(String name){
        this.name =name;

    }

    //Getter ve setter yapılarıdır. Bunları @Data şeklinde lombok kullanarak yapabilmekteyiz.
    public String getName() {
        return name;
    }
    public String getSirname() {
        return sirname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSirname(String sirname) {
        this.sirname = sirname;
    }
}
