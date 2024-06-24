import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner overScanner = new Scanner(System.in);
        Sports objSports = new Sports();
        Soccer objSoccer = new Soccer();
        objSports.getNumberOfTeamMembers(objSports.getName());
        objSports.getNumberOfTeamMembers(objSoccer.getName());
        




    }
}

class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(String name ){
        int a = 0;
        if(name == "Soccer Class"){
            System.out.println(name);
            a = 11;
            System.out.println( "Each team has "+ a + " players in " + name );
        }
        else{
            System.out.println(getName());
            System.out.println( "Each team has n players in " + getName() );
        }
        
        
    }

}
class Soccer extends Sports{
    String getName(){
        return "Soccer Class";
    }
}