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

}
