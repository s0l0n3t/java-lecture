public class normalUser extends Register{



    public normalUser(String name, String sirname){
        super.setName(name);
        super.setSirName(sirname);
        System.out.println("Normal üyelik tamamlandı !");
        super.setUserNumber((int)Math.ceil(Math.random()*100));
    }
}
