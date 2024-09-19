package Homework.InsuranceManagementSystem;

public class AddressManager {
    private User user;
    public AddressManager(User user){
       this.user = user;
    }
    public void addAddress(int select,String country,String city){
        if(select == 1){//1 -> home address, 2 -> business address
            user.addHomeAddress(new HomeAddress(country,city));
        }
        else {
            user.addBusinessAddress(new BusinessAddress(country,city));
        }
    }
    public void deleteAddress(int select,String country, String city){
        if(select == 1){
            user.deleteAddress(new HomeAddress(country,city));
        }
        else{
            user.deleteAddress(new BusinessAddress(country,city));
        }
    }
}
