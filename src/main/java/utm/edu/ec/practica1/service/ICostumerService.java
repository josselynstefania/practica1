package utm.edu.ec.practica1.service;

import utm.edu.ec.practica1.entity.Customer;
import java.util.List;

public interface ICostumerService {
    void saveCustomer(Customer customer);
    List<Customer> findCustomers();
}
