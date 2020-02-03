package jp.bap.powersupplymanagement.Manager.company;

import jp.bap.powersupplymanagement.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/company")
    public List<Company> showAllCompany() {
        return companyService.getCompanyRepository().findAll();
    }

    @GetMapping("/company/{id}")
    public ResponseEntity<Company> showCompanyById(@PathVariable String id) {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("Responded", "MyController");
        return new ResponseEntity<>(companyService.getCompanyRepository().getOne(Integer.parseInt(id)),responseHeaders, HttpStatus.OK);
    }

//    @GetMapping("/company/{id}")
//    public Company showCompanyById(@PathVariable String id) {
//        return companyService.getCompanyRepository().getOne(Integer.parseInt(id));
//    }
}