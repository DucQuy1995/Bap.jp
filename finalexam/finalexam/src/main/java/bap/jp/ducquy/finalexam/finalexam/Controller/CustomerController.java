package bap.jp.ducquy.finalexam.finalexam.Controller;

import bap.jp.ducquy.finalexam.finalexam.Model.Customer;
import bap.jp.ducquy.finalexam.finalexam.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    public CustomerService customerService;

    @GetMapping("/Customer")
    public List<Customer> findAllCustomer(){
        return customerService.findAll();
    }
}
