package jp.bap.powersupplymanagement.Manager.staff;

import jp.bap.powersupplymanagement.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService {

    @Autowired
    private StaffRepository staffRepository;


    public StaffService() {
    }

    public StaffRepository getStaffRepository() {
        return staffRepository;
    }

    public void setStaffRepository(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

}
