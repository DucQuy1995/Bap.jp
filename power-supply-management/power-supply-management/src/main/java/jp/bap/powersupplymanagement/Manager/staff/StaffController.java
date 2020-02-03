package jp.bap.powersupplymanagement.Manager.staff;

import jp.bap.powersupplymanagement.model.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StaffController {

    @Autowired
    private StaffService staffService;

    @GetMapping("/staff")
    public List<Staff> showAllStaff() {
        return staffService.getStaffRepository().findAll();
    }
}
