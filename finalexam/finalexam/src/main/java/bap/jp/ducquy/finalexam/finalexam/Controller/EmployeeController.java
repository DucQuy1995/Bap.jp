package bap.jp.ducquy.finalexam.finalexam.Controller;

import bap.jp.ducquy.finalexam.finalexam.Model.Employee;
import bap.jp.ducquy.finalexam.finalexam.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    public EmployeeService employeeService;

    @GetMapping("/Employee")
    public List<Employee> findAllEmployee(){
        return employeeService.findAll();
    }

//    @GetMapping("/Employee/{id}")
//    public ResponseEntity<Employee> showEmployeeById(){
//        HttpHeaders responseHeaders = new HttpHeaders();
//        responseHeaders.add("Responded", "EmployeeController");
//        return new ResponseEntity<>(employeeService.getEmployeeRepository().getOne(Integer.parseInt(id)),responseHeaders, HttpStatus.OK);
//    }
}
