package bap.jp.ducquy.finalexam.finalexam.Repository;

import bap.jp.ducquy.finalexam.finalexam.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
