package bap.jp.ducquy.finalexam.finalexam.Repository;

import bap.jp.ducquy.finalexam.finalexam.Model.InvoiceLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceLineRepository extends JpaRepository<InvoiceLine, Integer> {
}
