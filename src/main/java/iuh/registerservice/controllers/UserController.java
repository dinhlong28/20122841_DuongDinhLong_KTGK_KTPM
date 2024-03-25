package iuh.registerservice.controllers;

import iuh.registerservice.models.User;
import iuh.registerservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    List<User> getListUser(){
        return  userService.getListUser();
    }
    @GetMapping("/users/{id}")
    User getUserById(@PathVariable long id){
        return userService.getUserById(id);
    }
    @PostMapping("/addusers")
    void postListUser(){
        User user = new User(11, "User11", "11", "11");
        userService.addUser(user);
    }
}

