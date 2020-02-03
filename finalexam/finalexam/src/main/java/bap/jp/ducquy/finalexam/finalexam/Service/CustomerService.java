package bap.jp.ducquy.finalexam.finalexam.Service;

import bap.jp.ducquy.finalexam.finalexam.Model.Customer;
import bap.jp.ducquy.finalexam.finalexam.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerService() {
    }

    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
