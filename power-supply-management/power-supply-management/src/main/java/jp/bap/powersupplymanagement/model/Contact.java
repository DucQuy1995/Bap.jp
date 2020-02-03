package jp.bap.powersupplymanagement.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;

//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name="contact")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="email")
    private String email;

    @Column(name="address1")
    private String address1;

    @Column(name="address2")
    private String address2;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="fax")
    private String fax;

    @OneToOne(mappedBy = "contact")
    @JsonBackReference
    private Company company;

    @OneToOne(mappedBy = "contact")
    @JsonBackReference
    private Staff staff;

    @OneToOne(mappedBy = "contact")
    @JsonBackReference
    private User user;

    public Contact() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Company getCompany() {
        return company;
    }

    public Staff getStaff() {
        return staff;
    }

    public User getUser() {
        return user;
    }
}
