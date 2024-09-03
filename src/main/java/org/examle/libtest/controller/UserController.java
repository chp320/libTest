package org.examle.libtest.controller;

import org.examle.libtest.entity.User;
import org.examle.libtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/search")
    public List<User> getUsers() {return userService.getAllUsers();}

    @GetMapping("/users/search2")
    public User getUsers2(@RequestParam String id) {
        int newId = Integer.parseInt(id);
        return userService.getUserById(newId);}

    @GetMapping("/users/create")
    public User createUser(@RequestParam String id,
                           @RequestParam String firstName,
                           @RequestParam String lastName) {
        int newId = Integer.parseInt(id);
        User user = new User();
        user.setId(newId);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return userService.createUser(user);
    }
}
