package jp.bap.powersupplymanagement.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.util.List;

//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name="company")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @OneToOne
    @JoinColumn(name="contact_id")
    @JsonManagedReference
    private Contact contact;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Device> devices;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Staff> staff;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<User> users;

    public Company() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
