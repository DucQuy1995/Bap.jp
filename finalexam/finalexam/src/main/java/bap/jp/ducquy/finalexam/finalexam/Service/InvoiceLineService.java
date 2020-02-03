package bap.jp.ducquy.finalexam.finalexam.Service;

import bap.jp.ducquy.finalexam.finalexam.Repository.InvoiceLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceLineService {

    @Autowired
    private InvoiceLineRepository invoiceLineRepository;

    public InvoiceLineService() {
    }

    public InvoiceLineRepository getInvoiceLineRepository() {
        return invoiceLineRepository;
    }

    public void setInvoiceLineRepository(InvoiceLineRepository invoiceLineRepository) {
        this.invoiceLineRepository = invoiceLineRepository;
    }
}
