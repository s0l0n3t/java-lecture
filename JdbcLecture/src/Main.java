import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        //Java database connectivity api
        //user
        //asd123
        DatabaseManagement management = new DatabaseManagement();
        //management.addUser(management.connectDatabase() ,new UserClass(1,"aliergn","aerg123","aergn@gmail.com"));
        //management.addUserPrepared(management.connectDatabase(), new UserClass(1,"ftgz","asd123","furkant.41@gmail.com"));
        System.out.println(management.removeUserPrepared(management.connectDatabase(), new UserClass(1,"ftgz","asd123","")));
        ArrayList<UserClass> mainList = management.getTable(management.connectDatabase());
        for(int i = 0;i< mainList.size();i++){
            System.out.println(mainList.get(i).getUsername());
        }
    }
}