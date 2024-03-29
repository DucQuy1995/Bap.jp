package jp.bap.powersupplymanagement.repository;

import jp.bap.powersupplymanagement.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer> {
}
