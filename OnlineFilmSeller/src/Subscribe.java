public class Subscribe extends Register {
    private int creditUser;

    
    //CONSTRUCTOR
    public Subscribe(String name,String sirname){
        super.setName(name);
        super.setSirName(sirname);
        super.setUserNumber((int)Math.ceil(Math.random()*1000));
        this.creditUser = 100;
        System.out.println("Normal üyelik tamamlandı !");
    }
    

    //GETTER AND SETTERS
    public int getCreditUser() {
        return creditUser;
    }
    public void setCreditUser(int creditUser) {
        this.creditUser = creditUser;
    }

    public void rentFilm(int value){
        this.creditUser -= value;
        
    }
}
