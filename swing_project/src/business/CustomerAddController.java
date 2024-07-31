package business;

import dao.CustomerAddDao;
import dao.CustomerDao;
import entity.Customer;

public class CustomerAddController {
    private final CustomerAddDao customerAddDao = new CustomerAddDao();


    public Customer addCustomer(String name, Customer.TYPE type,String phone,String mail,String address){
        return this.customerAddDao.addCustomer(name,type,phone,mail,address);
    }
}
