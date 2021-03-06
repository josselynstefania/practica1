package utm.edu.ec.practica1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.edu.ec.practica1.entity.Customer;
import utm.edu.ec.practica1.service.ICostumerService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {

    @Autowired
    private ICostumerService costumerService;

    @PostMapping()
    public void saveCustomer (@RequestBody Customer customer){
        costumerService.saveCustomer(customer);
    }

    @GetMapping()
    public List<Customer> findCostumer(){
        return costumerService.findCustomers();
    }

    @DeleteMapping()
    public void saveCustomer (@RequestParam UUID id){
    }
}
