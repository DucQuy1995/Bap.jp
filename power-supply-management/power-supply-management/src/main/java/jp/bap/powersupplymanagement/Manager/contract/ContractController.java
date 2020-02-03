package jp.bap.powersupplymanagement.Manager.contract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContractController {

    @Autowired
    private ContractService contractService;

    @GetMapping("/contract")
    public List<?> showAllContract() {
        return contractService.getContractRepository().findAll();
    }
}
