package jp.bap.powersupplymanagement.repository;

import jp.bap.powersupplymanagement.model.ContractType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractTypeRepository extends JpaRepository<ContractType,Integer> {
}
