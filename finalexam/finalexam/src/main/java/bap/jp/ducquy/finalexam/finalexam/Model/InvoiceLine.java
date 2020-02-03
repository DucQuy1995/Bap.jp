package bap.jp.ducquy.finalexam.finalexam.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "invoiceLine")
public class InvoiceLine {

    @Id
    @GeneratedValue
    @Column(name = "InvoiceLineId")
    private int id;

    @ManyToOne
    @JoinColumn(name = "InvoiceId")
    @JsonManagedReference
    private Invoice invoice;

    @ManyToOne
    @JoinColumn(name = "TrackId")
    @JsonManagedReference
    private Track track;

    @Column(name = "UnitPrice")
    private float unitPrice;

    @Column(name = "Quantity")
    private int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
