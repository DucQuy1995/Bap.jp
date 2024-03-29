package jp.bap.powersupplymanagement.Manager.user;

import jp.bap.powersupplymanagement.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> showAllUser() {
        return userService.getUserRepository().findAll();
    }
}
