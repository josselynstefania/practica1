package utm.edu.ec.practica1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utm.edu.ec.practica1.entity.Customer;
import utm.edu.ec.practica1.repository.ICustomerRepository;

import java.util.List;

@Service
public class CustomerService implements ICostumerService{

    @Autowired
    private ICustomerRepository costumerRepository;

    @Override
    public void saveCustomer(Customer customer) {
        costumerRepository.save(customer);

    }

    @Override
    public List<Customer> findCustomers() {
        return costumerRepository.findAll();
    }
}
