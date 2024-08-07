package business;

import dao.CustomerDao;
import entity.Customer;

import java.util.ArrayList;

public class CustomerController {
    private final CustomerDao customerDao = new CustomerDao();


    public ArrayList<Customer> findCustomer(){
       return this.customerDao.findCustomer();
    }
    public Customer findById(int id){
        return this.customerDao.getById(id);
    }
    public Customer addCustomer(String name, Customer.TYPE type,String phone,String mail,String address){
        return this.customerDao.addCustomer(name,type,phone,mail,address);
    }

}
