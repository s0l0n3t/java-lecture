package Homework.InsuranceManagementSystem;
import java.util.ArrayList;
import java.util.TreeSet;

public class AccountManager extends AccountClass{
    public static ArrayList<User> userTreeSet = new ArrayList<>();
    private String email;
    private String password;
    public AccountManager(User user) {
        super(user);
    }
    public AuthenticationStatusEnum login() {
        for (User varUser : userTreeSet) {
            if (login(this.email, this.password) == AuthenticationStatusEnum.SUCCESS) {
                return AuthenticationStatusEnum.SUCCESS;
            }
        }
        return AuthenticationStatusEnum.FAIL;
    }
    public AuthenticationStatusEnum createUser(User user){
        try {
            userTreeSet.add(user);
            return AuthenticationStatusEnum.SUCCESS;
        }
        catch (Exception exception){
            return AuthenticationStatusEnum.FAIL;
        }
    }

}
