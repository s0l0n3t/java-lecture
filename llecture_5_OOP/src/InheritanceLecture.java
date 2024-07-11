public class InheritanceLecture {
    private String name;
    private String sirname;


    
    public void eatFood(){
        System.out.println("Yemek yendi.");
    }
    public void talk(String letter){
        System.out.println(letter);
    }
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
