package bap.jp.ducquy.finalexam.finalexam.Repository;

import bap.jp.ducquy.finalexam.finalexam.Model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
}
