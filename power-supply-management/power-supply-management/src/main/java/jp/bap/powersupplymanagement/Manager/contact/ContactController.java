package jp.bap.powersupplymanagement.Manager.contact;

import jp.bap.powersupplymanagement.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/contact")
    public List<Contact> showAllContact() {
        return contactService.getContactRepository().findAll();
    }

//    @PostMapping("/contact")
//    public Contact createContact(@RequestBody Map<String, String> body) {
//        Contact contact = new Contact();
//        contact.setEmail(body.get("email"));
//        contact.setAddress1(body.get("address1"));
//        contact.setAddress2(body.get("address2"));
//        contact.setPhoneNumber(body.get("phoneNumber"));
//        contact.setFax(body.get("fax"));
//        return contactService.getContactRepository().save(contact);
//    }

    @PostMapping("/contact")
    public Contact createContact(@RequestBody Contact contact) {
        return contactService.getContactRepository().save(contact);
    }

}
