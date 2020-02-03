package jp.bap.powersupplymanagement.repository;

import jp.bap.powersupplymanagement.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {


}
