package bap.jp.ducquy.finalexam.finalexam.Service;

import bap.jp.ducquy.finalexam.finalexam.Model.Employee;
import bap.jp.ducquy.finalexam.finalexam.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeService() {
    }

    public EmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }

    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }
}
