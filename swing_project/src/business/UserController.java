package business;

import core.helper;
import dao.CustomerDao;
import dao.UserDao;
import entity.User;

public class UserController {
    private final UserDao userDao = new UserDao();


    public User findLogin(String mail,String password){
        if(!helper.isEmailValid(mail)) return null;//Control security check.
        return this.userDao.findLogin(mail,password);
    }

}
